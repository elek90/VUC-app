package dk.schoubo.library.android.sql;


import java.util.Random;

import dk.schoubo.library.android.ServerLibraryConstants;
import dk.schoubo.library.android.bcrypt.BCrypt;

public abstract class SQLUtil
{
  private static final Random ran = new Random();

  public static Long nextId()
  {
    long l;
    do { l = ran.nextLong(); } while (l == 0L);

    return l;
  }

  public static String hashString(final String password)
  {
    if (password.startsWith("$")) return password;

    String hashed = BCrypt.hashpw(password, BCrypt.gensalt(ServerLibraryConstants.BCRYPT_LOG_ROUNDS));
    return hashed;
  }
}
