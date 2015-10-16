package dk.schoubo.library.android.util;

/**
 * Formatting of numbers as text strings and various other utility routines.
 * The utility methods formats numbers as <code>java.lang.String</code> values.
 *
 * @author      Jan Schoubo
 */
public abstract class Tal
{
  /**
   * Return a fixed length string representing a right-justified number.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @return          a string with the number right-justified
   */
  public static String dec(final int n, final int fw)
  {
    return Tekst.padFront(Integer.toString(n), fw);
  }

  /**
   * Return a fixed length string representing a number of right-justified numbers.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @return          a string with the number right-justified
   */
  public static String dec(final int[] n, final int fw)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      r += Tal.dec(n[i], fw);
    }
    return r;
  }

  /**
   * Return a fixed length string representing a matrix of right-justified numbers.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @return          a string with the number right-justified
   */
  public static String dec(final int[][] n, final int fw)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      for (int j = 0; j < n[i].length; j++)
      {
        r += Tal.dec(n[i][j], fw);
      }
      if (i < n.length-1) r += "\n";
    }
    return r;
  }

  /**
   * Return a fixed length string representing a right-justified number.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @return          a string with the number right-justified
   */
  public static String dec(final long n, final int fw)
  {
    return Tekst.padFront(Long.toString(n), fw);
  }

  /**
   * Return a fixed length string representing a number of right-justified numbers.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @return          a string with the number right-justified
   */
  public static String dec(final long[] n, final int fw)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      r += Tal.dec(n[i], fw);
    }
    return r;
  }

  /**
   * Return a fixed length string representing a matrix of right-justified numbers.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @return          a string with the number right-justified
   */
  public static String dec(final long[][] n, final int fw)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      for (int j = 0; j < n[i].length; j++)
      {
        r += Tal.dec(n[i][j], fw);
      }
      if (i < n.length-1) r += "\n";
    }
    return r;
  }

  /**
   * Return a fixed length string representing a right-justified text.
   * <p>
   * This routine is mainly to support pas2java conversions.
   *
   * @param s         the string
   * @param fw        the string length
   * @return          a string with the content right-justified
   */
  public static String dec(final String s, final int fw)
  {
    return Tekst.padFront(s, fw);
  }

  /**
   * Return a fixed length string representing a right-justified number in octal form.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @return          a string with the octal number right-justified
   */
  public static String oct(final int n, final int fw)
  {
    return Tekst.padFront(Integer.toOctalString(n), '0', fw);
  }

  /**
   * Return a fixed length string representing a right-justified number in octal form.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @return          a string with the octal number right-justified
   */
  public static String oct(final long n, final int fw)
  {
    return Tekst.padFront(Long.toOctalString(n), '0', fw);
  }

  /**
   * Return a fixed length string representing a right-justified number in hexadecimal form.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @return          a string with the hexadecimal number right-justified
   */
  public static String hex(final int n, final int fw)
  {
    return Tekst.padFront(Integer.toHexString(n), fw);
  }

  /**
   * Return a fixed length string representing a right-justified number in hexadecimal form.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @return          a string with the hexadecimal number right-justified
   */
  public static String hex(final long n, final int fw)
  {
    return Tekst.padFront(Long.toHexString(n), fw);
  }

  /**
   * Return a fixed length string representing a right-justified decimal number.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param d         the number
   * @param fw        the string length
   * @param fwd       the number of digits after the decimal point
   * @return          a string with the decimal number right-justified
   */
  public static String dec(final double d, final int fw, final int fwd)
  {
    boolean neg = (d < 0.0);
    long n = Math.round(Math.abs(d) * Math.pow(10, fwd));
    String r = Tekst.padFront(Long.toString(n), '0', fwd+1);
    if (neg) { r = "-" + r; }
    r = Tekst.padFront(r, fw-1);
    r = r.substring(0, r.length()-fwd) + "." + r.substring(r.length()-fwd);
    if (r.length() > fw)
    {
      int c = (r.length()-fw > fwd+1 ? fwd+1 : r.length()-fw);
      r = r.substring(0, r.length()-c);
    }
    //     System.out.println("d, fw, fwn: " + d + "," + fw + "," + fwd + " = <" + r + ">");
    return r;
  }

  /**
   * Return a fixed length string representing a number of right-justified decimal numbers.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param d         the numbers
   * @param fw        the string length
   * @param fwd       the number of digits after the decimal point
   * @return          a string with the decimal numbers right-justified
   */
  public static String dec(final double[] d, final int fw, final int fwd)
  {
    String r = "";
    for (int i = 0; i < d.length; i++)
    {
      r += Tal.dec(d[i], fw, fwd);
    }
    return r;
  }

  /**
   * Return a fixed length string representing a number of right-justified decimal numbers.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param d         the matrix of numbers
   * @param fw        the string length
   * @param fwd       the number of digits after the decimal point
   * @return          a string with the decimal numbers right-justified
   */
  public static String dec(final double[][] d, final int fw, final int fwd)
  {
    String r = "";
    for (int i = 0; i < d.length; i++)
    {
      for (int j = 0; j < d[i].length; j++)
      {
        r += Tal.dec(d[i][j], fw, fwd);
      }
      if (i < d.length-1) r += "\n";
    }
    return r;
  }

  /**
   * Return a fixed length string representing a right-justified number with leading zeroes.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @param fwn       the number of zeroes
   * @return          a string with the number right-justified
   */
  public static String dec(final int n, final int fw, final int fwn)
  {
    StringBuffer s =
      new StringBuffer(Tekst.padFront(Integer.toString(n), fw));
    // System.out.println("s.length:" + s.length);
    for (int i = fw; i > fw - fwn; i--)
    {
      if (s.charAt(i - 1) == ' ')
      {
        s.setCharAt(i - 1, '0');
      }
    }
    // System.out.println("n, fw, fwn: " + n + "," + fw + "," + fwn + " = <" + new String(s) + ">");
    return s.toString();
  }

  /**
   * Return a fixed length string representing a number of right-justified numbers with leading zeroes.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @param fwn       the number of zeroes
   * @return          a string with the numbers right-justified
   */
  public static String dec(final int[] n, final int fw, final int fwn)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      r += Tal.dec(n[i], fw, fwn);
    }
    return r;
  }

  /**
   * Return a fixed length string representing a matrix of right-justified numbers with leading zeroes.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @param fwn       the number of zeroes
   * @return          a string with the numbers right-justified
   */
  public static String dec(final int[][] n, final int fw, final int fwn)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      for (int j = 0; j < n[i].length; j++)
      {
        r += Tal.dec(n[i][j], fw, fwn);
      }
      if (i < n.length-1) r += "\n";
    }
    return r;
  }


  /**
   * Return a fixed length string representing a right-justified number with leading zeroes.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @param fwn       the number of zeroes
   * @return          a string with the number right-justified
   */
  public static String dec(final long n, final int fw, final int fwn)
  {
    StringBuffer s =
      new StringBuffer(Tekst.padFront(Long.toString(n), fw));
    for (int i = fw; i > fw - fwn; i--)
    {
      if (s.charAt(i - 1) == ' ')
      {
        s.setCharAt(i - 1, '0');
      }
    }
    return s.toString();
  }

  /**
   * Return a fixed length string representing a number of right-justified numbers with leading zeroes.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @param fwn       the number of zeroes
   * @return          a string with the numbers right-justified
   */
  public static String dec(final long[] n, final int fw, final int fwn)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      r += Tal.dec(n[i], fw, fwn);
    }
    return r;
  }

  /**
   * Return a fixed length string representing a matrix of right-justified numbers with leading zeroes.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the numbers
   * @param fw        the string length
   * @param fwn       the number of zeroes
   * @return          a string with the numbers right-justified
   */
  public static String dec(final long[][] n, final int fw, final int fwn)
  {
    String r = "";
    for (int i = 0; i < n.length; i++)
    {
      for (int j = 0; j < n[i].length; j++)
      {
        r += Tal.dec(n[i][j], fw, fwn);
      }
      if (i < n.length-1) r += "\n";
    }
    return r;
  }










  /**
   * Return a fixed length string representing a right-justified number.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @param zero      string to return, if n is zero
   * @return          a string with the number right-justified
   */
  public static String dec(final int n, final int fw, final String zero)
  {
    if (n == 0) return Tekst.padFront(zero, fw);
    return Tekst.padFront(Integer.toString(n), fw);
  }

  /**
   * Return a fixed length string representing a right-justified number.
   * <p>
   * The string will be longer if the number cannot be represented in the length given.
   *
   * @param n         the number
   * @param fw        the string length
   * @param zero      string to return, if n is zero
   * @return          a string with the number right-justified
   */
  public static String dec(final long n, final int fw, final String zero)
  {
    if (n == 0) return Tekst.padFront(zero, fw);
    return Tekst.padFront(Long.toString(n), fw);
  }




  /** Format ordinal number according to rules used in afa stamp catalog.
   *
   * The numbering is as follows:<br/>
   * A..Z, <br/>
   * Aa..Az, Ba..Bz, ..., Za..Zz, <br/>
   * Aaa..Aaz, Aba..Abz, ..., Zza..Zzz, <br/>
   * Aaaa...Zzzz etc.<br/>
   * <br>
   * A corresponds to 1.
   *
   * @param num
   * @return afa numbering
   */
  public static String afa(final int num)
  {
    final int mod = 'z'-'a'+1;

    if (num < 1) throw new RuntimeException("Only positive numbers can be afa-numbered: "+num);

    int n = num;

    String res = "";

    while (n > 0)
    {
      n = n - 1;
      char ch = (char)('a' + n % mod);

      if (n >= mod)
        res = ch + res;
      else
        res = Character.toUpperCase(ch) + res;

      n = n / mod;
    }
    return res;
  }










  /**
   * Returns true if the parameter passes a Modulus 11 check.
   *
   * <p>
   * The Modulus 11 check computes a weighed sum of the digits in the number, and
   * succeeds if this weighed sum is a multiplum of 11.
   *
   * <p>
   * The weighs are meant for Danish 10-digit CPR numbers.
   * <p>
   * The weigh values are {4,3,2,7,6,5,4,3,2,1} is the same order as the digits.
   *
   * <p>
   * Example:
   * <p>
   * 251056-0135 is checked thus:
   * <br>2*4 + 5*3 + 1*2 + 0*7 + 5*6 + 6*5 + 0*4 + 1*3 + 3*2 + 5*1 = 99 = 9 * 11
   *
   *
   * <h2>Personnummerets opbygning</h2>
   *
   * Position 10: ulige ciffer = mænd, lige ciffer = kvinder
   *
   *        Fødsels-
   * Dag     Måned    år      Løbenummer    Årstal
   *  1-2     3-4      5-6        7-10
   *
   * 1 - 31  1 - 12  00 - 99  0001 - 0999  1900 - 1999
   * 1 - 31  1 - 12  00 - 99  1000 - 1999  1900 - 1999
   * 1 - 31  1 - 12  00 - 99  2000 - 2999  1900 - 1999
   * 1 - 31  1 - 12  00 - 99  3000 - 3999  1900 - 1999
   * 1 - 31  1 - 12  00 - 36  4000 - 4999  2000 - 2036
   * 1 - 31  1 - 12  37 - 99  4000 - 4999  1937 - 1999
   * 1 - 31  1 - 12  00 - 36  5000 - 5999  2000 - 2036
   * 1 - 31  1 - 12  37 - 57  5000 - 5999  Benyttes ikke
   * 1 - 31  1 - 12  58 - 99  5000 - 5999  1858 - 1899
   * 1 - 31  1 - 12  00 - 36  6000 - 6999  2000 - 2036
   * 1 - 31  1 - 12  37 - 57  6000 - 6999  Benyttes ikke
   * 1 - 31  1 - 12  58 - 99  6000 - 6999  1858 - 1899
   * 1 - 31  1 - 12  00 - 36  7000 - 7999  2000 - 2036
   * 1 - 31  1 - 12  37 - 57  7000 - 7999  Benyttes ikke
   * 1 - 31  1 - 12  58 - 99  7000 - 7999  1858 - 1899
   * 1 - 31  1 - 12  00 - 36  8000 - 8999  2000 - 2036
   * 1 - 31  1 - 12  37 - 57  8000 - 8999  Benyttes ikke
   * 1 - 31  1 - 12  58 - 99  8000 - 8999  1858 - 1899
   * 1 - 31  1 - 12  00 - 36  9000 - 9999  2000 - 2036
   * 1 - 31  1 - 12  37 - 99  9000 - 9999  1937 - 1999
   *
   *
   * @param n a 10-digit number that is to be checked according to the Modulus 11 check.
   * @return <code>true</code> if the Modulus 11 check succeeds.
   */
  public static boolean isMod11(final long n)
  {
    long s = 0;
    long w = 1;
    long nn = n;

    while (nn > 0)
    {
      s += (nn % 10) * w;
      nn /= 10;
      w += 1; if (w > 7) { w = 2; }
    }

    return (s % 11) == 0;
  }


  /* Returns true if the parameter passes a Luhn (mod 10) check.
   *
   * <p>
   * The Luhn check computes a weighed sum of the digits in the number, and
   * succeeds if this weighed sum is a multiplum of 10.
   *
   * <p>
   * This algorithm is used for major credit card numbers.
   * The weigh values are {...1,2,1,2,1,2,1} in the same order as the digits.
   *
   * <p>
   * Example:
   * <p>
   * 49927398716 is checked thus:
   * <code>
   * <br>4  9  9  2  7  3  9  8  7  1  6
   * <br>  *2    *2    *2    *2    *2
   * <br>-------------------------------
   * <br>4 18  9  4  7  6  9 16  7  2  6
   * <br>-------------------------------
   * <br>4+ 9+ 9+ 4+ 7+ 6+ 9+ 7+ 7+ 2+ 6 = 70 = 7 * 10
   * </code>
   *
   * @param n a number that is to be checked according to the Luhn (mod 10)  check.
   * @return <code>true</code> if the Luhn (mod 10) check succeeds.
   *
   * <table>
   *   <tr>
   *     <td>CARD TYPE</td><td>Prefix</td><td>Length</td><td>Check digit algorithm</td>
   *   </tr>
   *   <tr>
   *     <td>MASTERCARD</td><td>51-55</td><td>16</td><td>mod 10</td>
   *   </tr>
   *   <tr>
   *     <td>VISA</td><td>4</td><td>13,16</td><td>mod 10</td>
   *   </tr>
   *   <tr>
   *     <td>AMEX</td><td>34,37</td><td>15</td><td>mod 10</td>
   *   </tr>
   *   <tr>
   *     <td>Diners Club/Carte Blanche</td><td>300-305,36,38</td><td>14</td><td>mod 10</td>
   *   </tr>
   *   <tr>
   *     <td>Discover</td><td>6011</td><td>16</td><td>mod 10</td>
   *   </tr>
   *   <tr>
   *     <td>enRoute</td><td>2014,2149</td><td>15</td><td>any</td>
   *   </tr>
   *   <tr>
   *     <td>JCB</td><td>3</td><td>16</td><td>mod 10</td>
   *   </tr>
   *   <tr>
   *     <td>JCB</td><td>2131,1800</td><td>15</td><td>mod 10</td>
   *   </tr>
   * </table>
   */
  public static boolean isLuhnMod10(final long n)
  {
    long s = 0;
    long w = 1;
    long nn = n;

    while (nn > 0)
    {
      long d = (nn % 10) * w;
      if (d > 9)
      {
        d = (d % 10) + 1;
      }
      s += d;
      nn /= 10;
      w = 3-w;
    }

    return (s % 10) == 0;
  }




  public static double[] deepClone(final double[] a)
  {
    int n = a.length;
    double[] x = new double[n];
    for (int i = 0; i < n; i++)
    {
      x[i] = a[i];
    }
    return x;
  }

  public static double[][] deepClone(final double[][] a)
  {
    int n1 = a.length;
    int n2 = a[0].length;
    double[][] x = new double[n1][n2];
    for (int i = 0; i < n1; i++)
    {
      for (int j = 0; j < n2; j++)
      {
        x[i][j] = a[i][j];
      }
    }
    return x;
  }

  public static int[] deepClone(final int[] a)
  {
    int n = a.length;
    int[] x = new int[n];
    for (int i = 0; i < n; i++)
    {
      x[i] = a[i];
    }
    return x;
  }

  public static int[][] deepClone(final int[][] a)
  {
    int n1 = a.length;
    int n2 = a[0].length;
    int[][] x = new int[n1][n2];
    for (int i = 0; i < n1; i++)
    {
      for (int j = 0; j < n2; j++)
      {
        x[i][j] = a[i][j];
      }
    }
    return x;
  }

}
