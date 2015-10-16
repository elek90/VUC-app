package dk.schoubo.library.android.ui.framework;

public class PayloadAsyncValueAndResult<PA, V, PR, R> extends PayloadAsyncResult<PA, PR, R>
{
  private V value;
  public void setValue(final V value) { this.value = value; }
  public V getValue() { return value; }

  private PayloadAsyncValueAndResult()
  {
    super();
  }

  private PayloadAsyncValueAndResult(final V value)
  {
    super();
    this.value = value;
  }

  public static <PA, V, PR, R> PayloadAsyncValueAndResult<PA, V, PR, R> create()
  {
    return new PayloadAsyncValueAndResult<PA, V, PR, R>();
  }

  public static <PA, V, PR, R> PayloadAsyncValueAndResult<PA, V, PR, R> create(final V value)
  {
    return new PayloadAsyncValueAndResult<PA, V, PR, R>(value);
  }
}
