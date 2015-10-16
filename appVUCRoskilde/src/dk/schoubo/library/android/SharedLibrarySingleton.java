package dk.schoubo.library.android;

import java.util.HashSet;
import java.util.Set;

public abstract class SharedLibrarySingleton
{
  private static final Set<SharedLibraryDebugType> debugTypes = new HashSet<SharedLibraryDebugType>();

  public static void clearDebugging()
  {
    debugTypes.clear();
  }

  public static void addDebugging(final SharedLibraryDebugType debugType)
  {
    debugTypes.add(debugType);
  }

  public static void setDebugging(final SharedLibraryDebugType debugType)
  {
    clearDebugging();
    addDebugging(debugType);
  }

  public static boolean isDebugging(final SharedLibraryDebugType debugType)
  {
    return debugTypes.contains(debugType);
  }

  static
  {
    // addDebugging(SharedLibraryDebugType.NAVIGATION);
  }
}
