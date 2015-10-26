/** THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.view.View;
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
import dk.lundogbendsen.vucroskilde.android.generated.StepXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;


public class ActionSendReportViewDelegateContext extends ActionSendReportViewDelegateRoot
{

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
    // TODO To be filled out by YOU
    // cook up an email and ship it
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewBackActionSendReport(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionSendReport(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());
   
    guictx.linearLayoutActionSendReportAnswers.removeAllViews();
for (Object a : busctx.getAnswers(busctx.getCurrentExercise()).values())
{
  AnswerDetailGUI answerdetailgui = AnswerDetailGUI.create(activity, guictx, 0L);
  if (a instanceof ActionRecordTextXML)
  {
    ActionRecordTextXML answer = (ActionRecordTextXML)a;
    StepXML step = busctx.getStepById(answer.getParentStep());
    answerdetailgui.textViewAnswerDetailStepNumber.setText(step.getStepSequence());
    answerdetailgui.textViewAnswerDetailStepTitle.setText(step.getStepName());
  } else
    if (a instanceof ActionRecordImageXML)
    {
      ActionRecordImageXML answer = (ActionRecordImageXML)a;
      
    } else
      if (a instanceof ActionRecordAudioXML)
      {
        ActionRecordAudioXML answer = (ActionRecordAudioXML)a;
        
      } else
        if (a instanceof ActionRecordVideoXML)
        {
          ActionRecordVideoXML answer = (ActionRecordVideoXML)a;
          
        } else
        {
          throw new RuntimeException("Answer can only be one of the ActionRecord... types, but was "+a.getClass().getName());
        }
}
    
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
//    remove answer
    // set icon to inactive
    
    // TODO Auto-generated method stub
    
  }



}
