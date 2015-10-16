package dk.schoubo.library.android.ui.framework;

public class PayloadAsyncResult<PA, PR, R> implements Payload
{
  private PA[] parameters;
  public void setParameters(final PA[] parameters) { this.parameters = parameters; }
  public PA[] getParameters() { return parameters; }
  public PA getParameter(final int i) { return parameters[i]; }

  private PR[] progress;
  public void setProgress(final PR[] progress) { this.progress = progress; }
  public PR[] getProgress() { return progress; }

  private R result;
  public void setResult(final R result) { this.result = result; }
  public R getResult() { return result; }

  protected PayloadAsyncResult()
  {
  }

  public static <PA, PR, R> PayloadAsyncResult<PA, PR, R> create()
  {
    return new PayloadAsyncResult<PA, PR, R>();
  }
}
