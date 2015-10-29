/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportXML;
import dk.lundogbendsen.vucroskilde.android.generated.AnswerDetailGUI;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
import dk.lundogbendsen.vucroskilde.android.generated.StepXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.helpers.EmailHelper;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.util.DateAdapter;

public class ActionSendReportViewDelegateContext extends ActionSendReportViewDelegateRoot
{
  private static final String TAG = ActionSendReportViewDelegateContext.class.getName();
  
  private static final String MARGIN = "      ";
  
  @SuppressWarnings("unused")
  private ActionSendReportXML action;

  private ActionSendReportViewDelegateContext(final ActionSendReportRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionSendReportGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionSendReportViewDelegate create(final ActionSendReportRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionSendReportGUI guictx)
  {
    return new ActionSendReportViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionSendReportDoSendImageButton(final View view, final PayloadClick payload)
  {
    Map<String, Info> res = createAnswers();

    FlowchartXML mainFlowchart = busctx.getFlowchartById(busctx.getCurrentExercise().getFlowchart());

    String subject = "VUC Naturfag: Svar fra " + busctx.getCurrentStudent().getContact().getName() + " på øvelsen \"" + mainFlowchart.getFlowchartName() + "\"";

    String content = subject + "\n\n";

    List<String> attachments = new LinkedList<String>();

    for (Info info : res.values())
    {
      content += info.getSequence() + " " + info.getDescription() + ":\n";

      if (info.isAnswerFilled())
      {
        if (info.getMediaRef() != null)
        {
          if (info.getMediaRef().getPlacementType() == PlacementType.STORAGE)
          {
            attachments.add(info.getMediaRef().getPlacementPath());

            String filename = info.getMediaRef().getPlacementPath();
            int p = filename.lastIndexOf("/");
            if (p > -1)
            {
              filename = filename.substring(p + 1);
            }
            content += MARGIN + "[Se attachment: " + filename + "]";
          }
          else
          {
            content += MARGIN + "[Indbygget testsvar: " + info.getMediaRef().getPlacementPath() + "]";
          }
        }

        if (!info.getAnswerText().isEmpty())
        {
          content += "\n" + info.getAnswerText().replaceAll("\n", "\n   ");
        }
      }
      else
      {
        content += MARGIN + "--- Ikke besvaret ---";
      }

      content += "\n";
    }

    content += "\nSendt " + DateAdapter.humanDate(new Date()) + ".";

    content += "\n\nKærlig hilsen " + busctx.getCurrentStudent().getContact().getName();

    if (attachments.size() == 0)
    {
      EmailHelper.send(activity, Arrays.asList(new String[] { busctx.getCurrentStudent().getContact().getEmail() }), subject, content);
    }
    else
    {
      EmailHelper.send(activity, new String[] { busctx.getCurrentStudent().getContact().getEmail() }, subject, content, attachments);
    }

    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewBackActionSendReport(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_OK);
  }

  private static class Info
  {
    private final String sequence;

    public String getSequence()
    {
      return sequence;
    }

    private final String description;

    public String getDescription()
    {
      return description;
    }

    private final boolean answerFilled;

    public boolean isAnswerFilled()
    {
      return answerFilled;
    }

    private final MediaRefXML mediaRef;

    public MediaRefXML getMediaRef()
    {
      return mediaRef;
    }

    private final String answerText;

    public String getAnswerText()
    {
      return answerText;
    }

    public Info(final String seq, final String text, final boolean answerFilled, final MediaRefXML mediaRef, final String answerText)
    {
      super();
      this.sequence = seq;
      this.description = text;
      this.answerFilled = answerFilled;
      this.mediaRef = mediaRef;
      this.answerText = answerText;
    }

  }

  @Override
  public void onViewRefreshActionSendReport(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    guictx.linearLayoutActionSendReportAnswers.removeAllViews();

    Log.w(TAG, "Der er " + busctx.getAnswers(busctx.getCurrentExercise()).size() + " mulige svar-steder");

    Map<String, Info> res = createAnswers();

    for (Info info : res.values())
    {
      AnswerDetailGUI answerdetailgui = AnswerDetailGUI.create(activity, guictx, 0L);
      answerdetailgui.textViewAnswerDetailStepNumber.setText(info.getSequence());
      answerdetailgui.textViewAnswerDetailStepTitle.setText(info.getDescription());
      if (info.isAnswerFilled())
      {
        answerdetailgui.imageButtonAnswerDetailViewStep.setEnabled(true);
        answerdetailgui.imageButtonAnswerDetailDoStep.setEnabled(true);
        answerdetailgui.imageButtonAnswerDetailDeleteStep.setEnabled(true);
      }
      else
      {
        answerdetailgui.imageButtonAnswerDetailViewStep.setEnabled(false);
        answerdetailgui.imageButtonAnswerDetailDoStep.setEnabled(true);
        answerdetailgui.imageButtonAnswerDetailDeleteStep.setEnabled(false);
      }
      guictx.linearLayoutActionSendReportAnswers.addView(answerdetailgui.detail);
    }

  }

  private Map<String, Info> createAnswers()
  {
    Map<String, Info> answerInfo = new TreeMap<String, Info>();
    for (Object a : busctx.getAnswers(busctx.getCurrentExercise()).values())
    {
      if (a instanceof ActionRecordTextXML)
      {
        ActionRecordTextXML answer = (ActionRecordTextXML) a;
        StepXML step = busctx.getStepById(answer.getParentStep());
        answerInfo.put(step.getStepSequence(), new Info(step.getStepSequence(), step.getStepName(), answer.getDescription().isEmpty(), null, answer.getDescription()));
      }
      else if (a instanceof ActionRecordImageXML)
      {
        ActionRecordImageXML answer = (ActionRecordImageXML) a;
        StepXML step = busctx.getStepById(answer.getParentStep());
        answerInfo.put(step.getStepSequence(), new Info(step.getStepSequence(), answer.getDescription(), !answer.getImageRef().getPlacementPath().isEmpty(), answer.getImageRef(), ""));
      }
      else if (a instanceof ActionRecordAudioXML)
      {
        ActionRecordAudioXML answer = (ActionRecordAudioXML) a;
        StepXML step = busctx.getStepById(answer.getParentStep());
        answerInfo.put(step.getStepSequence(), new Info(step.getStepSequence(), answer.getDescription(), !answer.getAudioRef().getPlacementPath().isEmpty(), answer.getAudioRef(), ""));
      }
      else if (a instanceof ActionRecordVideoXML)
      {
        ActionRecordVideoXML answer = (ActionRecordVideoXML) a;
        StepXML step = busctx.getStepById(answer.getParentStep());
        answerInfo.put(step.getStepSequence(), new Info(step.getStepSequence(), answer.getDescription(), !answer.getVideoRef().getPlacementPath().isEmpty(), answer.getVideoRef(), ""));
      }
      else
      {
        throw new RuntimeException("Answer can only be one of the ActionRecord... types, but was " + a.getClass().getName());
      }
    }
    return answerInfo;
  }

  @Override
  public void onViewCreateActionSendReport(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionSendReportXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewClickChildAnswerDetailDoStepImageButton(final View view, final PayloadClick payload)
  {
    // call the step in edit mode
    // TODO Auto-generated method stub

  }

  @Override
  public void onViewClickChildAnswerDetailViewStepImageButton(final View view, final PayloadClick payload)
  {
    // call the step up in view mode
    // TODO Auto-generated method stub

  }

  @Override
  public void onViewClickChildAnswerDetailDeleteStepImageButton(final View view, final PayloadClick payload)
  {
    // remove answer
    // set icon to inactive

    // TODO Auto-generated method stub

  }

}
