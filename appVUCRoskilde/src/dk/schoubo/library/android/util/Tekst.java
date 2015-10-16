package dk.schoubo.library.android.util;

import java.util.*;

/**
 * Manipulation of text strings.
 * The utility methods supplement the <code>java.lang.String</code> class.
 *
 * @author      Jan Schoubo
 */
/**
 * @author jschoubo
 *
 */
public abstract class Tekst
{

  /**
   * Return a string with one character repeated.
   * The character is repeated a number of times.
   *
   * @param c         the character to repeat
   * @param fw        the number of repetitions
   * @return          a string with the character repeated <code>fw</code> times
   */
  public static String repeat(final char c, final int fw)
  {
    StringBuffer s = new StringBuffer();
    for (int i = 0; i < fw; i++)
    {
      s.append(c);
    }
    return s.toString();
  }

  /**
   * Return a string with one string repeated.
   * The string is repeated a number of times.
   *
   * @param c         the string to repeat
   * @param fw        the number of repetitions
   * @return          a string with the string repeated <code>fw</code> times
   */
  public static String repeat(final String c, final int fw)
  {
    StringBuffer s = new StringBuffer();
    for (int i = 0; i < fw; i++)
    {
      s.append(c);
    }
    return s.toString();
  }

  /**
   * Pad a string in front to a certain length.
   * A number of repetitions of the character is appended in front of the string
   * so it achieves a certain length.
   * <p>
   * If the string is not shorter than the specified length, no characters are appended.
   *
   * @param s         the string to augment
   * @param c         the character to append a number of times
   * @param fw        the final length of the string
   * @return          the character <code>c</code> a number of times followed by the string <code>s</code>
   *                  for a total length of <code>fw</code>
   */
  public static String padFront(final String s, final char c, final int fw)
  {
    return repeat(c, fw - s.length()) + s;
  }

  private static String substring(final String s, final int i, final int j)
  {
    if (j < 0) return "";
    return s.substring(i, j);
  }


  /** Overwrite a string with characters from another string.
   *
   * @param target the string to be overwritten
   * @param over the string to overwrite with
   * @param col the column to overwrite with the first character
   * @return the modified string
   */
  public static String overwrite(final String target, final String over, final int col)
  {
    StringBuffer buf = new StringBuffer(target);

    // Ensure room for overwrite
    for (int i = buf.length(); i < col+over.length(); i++) buf.append(' ');

    for (int i = 0; i < over.length(); i++)
    {
      buf.setCharAt(i+col, over.charAt(i));
    }

    //  System.out.println("Tekst.overwrite af "+target+" med "+over+" ("+col+") gav "+buf.toString());
    return buf.toString();
  }

  /** Overwrite a string with characters from another string, but preserving non-blank characters.
   *
   * @param target the string to be overwritten
   * @param over the string to overwrite with
   * @param col the column to overwrite with the first character
   * @return the modified string
   */
  public static String overwriteTransparently(final String target, final String over, final int col)
  {
    StringBuffer buf = new StringBuffer(target);

    // Ensure room for overwrite
    for (int i = buf.length(); i < col+over.length(); i++) buf.append(' ');

    for (int i = 0; i < over.length(); i++)
    {
      if (over.charAt(i) != ' ') buf.setCharAt(i+col, over.charAt(i));
    }

    //  System.out.println("Tekst.overwriteTransparently af "+target+" med "+over+" ("+col+") gav "+buf.toString());
    return buf.toString();
  }


  // TODO Test
  /** Force a string to be an exact length.
   *
   * Padding, if necessary, is done with spaces behind, truncation, if necessary, is done from the right.
   *
   * @param s
   * @param l the length in characters
   * @return String of the exact length
   */
  public static String box(final String s, final int l)
  {
    if (s.length() < l) return Tekst.padBehind(s, " ", l);
    if (s.length() > l) return s.substring(0, l);
    return s;
  }

  /** Force a string to be an exact length.
   *
   * Padding, if necessary, is done with spaces in front, truncation, if necessary, is done from the right.
   *
   * @param s
   * @param l the length in characters
   * @return String of the exact length
   */
  public static String boxright(final String s, final int l)
  {
    if (s.length() < l) return Tekst.padFront(s, " ", l);
    if (s.length() > l) return s.substring(0, l);
    return s;
  }


  /**
   * Pad a string in front to a certain length.
   * A number of repetitions of the string - possibly fractional - is appended in front of the string
   * so it achieves a certain length.
   * <p>
   * If the string is not shorter than the specified length, no characters are appended.
   *
   * @param s         the string to augment
   * @param c         the string to append a number of times
   * @param fw        the final length of the string
   * @return          the string <code>c</code> a (possibly fractional) number of times followed by the string <code>s</code>
   *                  for a total length of <code>fw</code>
   */
  public static String padFront(final String s, final String c, final int fw)
  {
    return repeat(c, (fw - s.length()) / c.length()) +
    substring(c, 0, (fw - s.length()) % c.length()) + s;
  }

  /**
   * Pad a string behind to a certain length.
   * A number of repetitions of the character is appended to the end of the string
   * so it achieves a certain length.
   * <p>
   * If the string is not shorter than the specified length, no characters are appended.
   *
   * @param s         the string to augment
   * @param c         the character to append a number of times
   * @param fw        the final length of the string
   * @return          the string <code>s</code> followed by the character <code>c</code> a number of times
   *                  for a total length of <code>fw</code>
   */
  public static String padBehind(final String s, final char c, final int fw)
  {
    return s + repeat(c, fw - s.length());
  }

  /**
   * Pad a string behind to a certain length.
   * A number of repetitions of the character is appended to the end of the string
   * so it achieves a certain length.
   * <p>
   * If the string is not shorter than the specified length, no characters are appended.
   *
   * @param s         the string to augment
   * @param c         the string to append a number of times
   * @param fw        the final length of the string
   * @return          the string <code>s</code> followed by the character <code>c</code> a number of times
   *                  for a total length of <code>fw</code>
   */
  public static String padBehind(final String s, final String c, final int fw)
  {
    return s + repeat(c, (fw - s.length()) / c.length()) +
    substring(c, 0, (fw - s.length()) % c.length());
  }

  /**
   * Pad a string in front with spaces to a certain length.
   * A number of repetitions of space is appended in front of the string
   * so it achieves a certain length.
   * <p>
   * If the string is not shorter than the specified length, no characters are appended.
   *
   * @param s         the string to augment
   * @param fw        the final length of the string
   * @return          a number of spaces followed by the string <code>s</code>
   *                  for a total length of <code>fw</code>
   */
  public static String padFront(final String s, final int fw)
  {
    return padFront(s, ' ', fw);
  }

  /**
   * Pad a string behind with spaces to a certain length.
   * A number of repetitions of space is appended to the end of the string
   * so it achieves a certain length.
   * <p>
   * If the string is not shorter than the specified length, no characters are appended.
   *
   * @param s         the string to augment
   * @param fw        the final length of the string
   * @return          the string <code>s</code> followed by a number of spaces
   *                  for a total length of <code>fw</code>
   */
  public static String padBehind(final String s, final int fw)
  {
    return padBehind(s, ' ', fw);
  }

  /**
   * Compare two strings, and return the maximum length that contains the same characters, counted from the beginning.
   * The returned value can at most be the length of the shortest string.
   *
   * @param a         the first string
   * @param b         the second string
   * @return          the number of characters that match counted from the beginning
   */
  public static int matchFromFront(final String a, final String b)
  {
    int i = 0;

    while ((a.length() > i) && (b.length() > i) && (a.charAt(i) == b.charAt(i))) i++;

    return i;
  }

  /**
   * Compare two strings, and return the maximum length that contains the same characters, counted from the end.
   * The returned value can at most be the length of the shortest string.
   *
   * @param a         the first string
   * @param b         the second string
   * @return          the number of characters that match counted from the end
   */
  public static int matchFromBehind(final String a, final String b)
  {
    int i = 0;

    while ((a.length() > i) && (b.length() > i) && (a.charAt(a.length()-i-1) == b.charAt(b.length()-i-1))) i++;

    return i;
  }



  /**
   * Return a concatenated string where the second part is only present if
   * the first is not empty.
   *
   * @param s         the string to return
   * @param sep       the second part, that is conditionally appended
   * @return          a string with the second part appended, if the first part is not empty
   */
  public static String concatIf(final String s, final String sep)
  {
    if (s.equals(""))
    {
      return s;
    }
    else
    {
      return s + sep;
    }
  }

  /**
   * Concatenated an element to a list, with separator in between, if needed.
   *
   * @param list      the list to add to
   * @param sep       the separator, that is conditionally appended
   * @param element   the element, that is conditionally appended
   * @return          a string with the sep and element appended, if list and element are both not empty
   */
  public static String listAdd(final String list, final String sep, final String element)
  {
    if (list.length() == 0)
    {
      return element;
    }
    else
      if (element.length() == 0)
      {
        return list;
      }
      else
      {
        return list + sep + element;
      }
  }

  /**
   * Create a list of separated strings.
   *
   * @param sep       the separator
   * @param element   the elements of the list
   * @return          a string with element0, sep, element1, sep, ... elementn-1 concatenated
   */
  public static String listCreate(final String sep, final String... element)
  {
    if (element.length == 0) return "";

    int j = 0;
    for (int i = 0; i < element.length && element[i].length() == 0; i++) j = i+1;
    if (! (j < element.length)) return "";

    StringBuffer res = new StringBuffer(element[j]);
    for (int i = j+1; i < element.length; i++)
    {
      if (!(element[i].length() == 0))
      {
        res.append(sep);
        res.append(element[i]);
      }
    }
    return res.toString();
  }

  /**
   * Return a string where a substring is replaced once.
   *
   * @param s         the string to process
   * @param a         string to look for
   * @param b         string to substitute
   *
   * @return          string with a replaced with b (once)
   */
  public static String replaceFirst(final String s, final String a, final String b)
  {
    int p = s.indexOf(a);
    if (p < 0)
    {
      return s;
    }
    else
    {
      return s.substring(0, p) + b + s.substring(0+p+a.length());
    }
  }

  /**
   * Return a string where a substring is replaced as many times as it is found.
   *
   * Replacement is NOT recursive,
   * (i.e. replaceAll("aaab", "aa", "ba") yields "baab", not "bbab")
   *
   * @param s         the string to process
   * @param a         string to look for
   * @param b         string to substitute
   *
   * @return          string with a replaced with b (once)
   */
  public static String replaceAll(final String s, final String a, final String b)
  {
    int p = s.indexOf(a);
    if (p < 0)
    {
      return s;
    }
    else
    {
      return s.substring(0, p) + b + replaceAll(s.substring(0+p+a.length()), a, b);
    }
  }

  /** Remove all characters from a string that is not present in the alphabet given.
   *
   * @param s
   * @param alphabet
   * @return String that only consists of those characters from <code>s</code> that are found in <code>alphabet</code>.
   */
  public static String removeAllBut(final String s, final String alphabet)
  {
    HashSet<Character> as = new HashSet<Character>();
    for (int i = 0; i < alphabet.length(); i++) as.add(alphabet.charAt(i));

    StringBuffer res = new StringBuffer(s.length());

    for (int i = 0; i < s.length(); i++)
    {
      if (as.contains(s.charAt(i))) res.append(s.charAt(i));
    }
    return res.toString();
  }



  /** Count the number of occurences of certain characters in a string.
   *
   * @param s String to search.
   * @param alphabet Character set to search for.
   * @return number of occurences of characters from <code>alphabet</code>
   */
  public static int count(final String s, final String alphabet)
  {
    int c = 0;

    HashSet<Character> as = new HashSet<Character>();
    for (int i = 0; i < alphabet.length(); i++) as.add(alphabet.charAt(i));

    for (int i = 0; i < s.length(); i++)
    {
      if (as.contains(s.charAt(i))) c++;
    }

    return c;
  }

  /** Count the number of occurences of a string in another string.
   *
   * Even if the string to search for allows overlapping matches,
   * those are not counted.
   * <br/>
   * Thus, searching for "bb" in "abbba" will result in 1, not 2.
   * <br/>
   * Searching for "bb" in "abbbba" or "abbbbba" will result in 2.
   *
   *
   * @param body String to search.
   * @param s String to search for.
   * @return number of occurences of <code>s</code> in <code>body</code>
   */
  public static int countOccurences(final String body, final String s)
  {
    int c = -1;
    int p = -1;

    do
    {
      c += 1;
      p = body.indexOf(s, p+s.length());
    }
    while (p > -1);

    return c;
  }




  /** According to Cambridge University research, only the first and last character in a string need to be positioned correctly.
   *
   *  The function mixes all characters in a word except the first and last.
   *
   * @param s String to be mixed
   * @return String with the same characters, but all except first and last shuffled.
   */
  public static String mixContent(final String s)
  {
    StringBuffer res = new StringBuffer(s);

    Random ran = new Random();

    int l = res.length();
    for (int i = 1; i < l-1-1; i++)
    {
      int j = (i+1)+ran.nextInt(l-1-(i+1));

      //      System.out.println(res+" (i,j:"+i+","+j+")");

      char c = res.charAt(j);
      res.setCharAt(j, res.charAt(i));
      res.setCharAt(i, c);
    }

    //    System.out.println(res);
    return res.toString();
  }




  /** Calculates the Levenshtein distance between two strings.
   *
   * Levenshtein distance (LD) is a measure of the similarity between two strings, which we
   * will refer to as the source string (s) and the target string (t).
   * The distance is the number of deletions, insertions, or substitutions
   * required to transform s into t.
   *
   * <p>
   * For example,
   * If s is "test" and t is "test", then LD(s,t) = 0, because no transformations are needed. The strings are already identical.
   * <br>
   * If s is "test" and t is "tent", then LD(s,t) = 1, because one substitution (change "s" to "n") is sufficient to transform s into t.
   *
   * <p>
   * The greater the Levenshtein distance, the more different the strings are.
   *
   * <p>
   * Levenshtein distance is named after the Russian scientist Vladimir Levenshtein,
   * who devised the algorithm in 1965. If you can't spell or pronounce Levenshtein,
   * the metric is also sometimes called edit distance.
   *
   * <p>
   * Originally written by Michael Gilleland, Merriam Park Software.
   *
   * @param s Source string
   * @param t Target string
   * @return Levenshtein distance
   */
  public static int LevenshteinDistance(final String s, final String t)
  {
    int d[][]; // matrix
    int n; // length of s
    int m; // length of t
    int i; // iterates through s
    int j; // iterates through t
    char s_i; // ith character of s
    char t_j; // jth character of t
    int cost; // cost

    // Step 1

    n = s.length();
    m = t.length();
    if (n == 0) {
      return m;
    }
    if (m == 0) {
      return n;
    }
    d = new int[n+1][m+1];

    // Step 2

    for (i = 0; i <= n; i++) {
      d[i][0] = i;
    }

    for (j = 0; j <= m; j++) {
      d[0][j] = j;
    }

    // Step 3

    for (i = 1; i <= n; i++) {

      s_i = s.charAt (i - 1);

      // Step 4

      for (j = 1; j <= m; j++) {

        t_j = t.charAt (j - 1);

        // Step 5

        if (s_i == t_j) {
          cost = 0;
        }
        else {
          cost = 1;
        }

        // Step 6

        d[i][j] = Math.min(Math.min(d[i-1][j]+1, d[i][j-1]+1), d[i-1][j-1] + cost);

      }

    }

    // Step 7

    return d[n][m];

  }

  /*
   * Copyright (c) Ian F. Darwin, http://www.darwinsys.com/, 1996-2002.
   * All rights reserved. Software written by Ian F. Darwin and others.
   *
   * Redistribution and use in source and binary forms, with or without
   * modification, are permitted provided that the following conditions
   * are met:
   * 1. Redistributions of source code must retain the above copyright
   *    notice, this list of conditions and the following disclaimer.
   * 2. Redistributions in binary form must reproduce the above copyright
   *    notice, this list of conditions and the following disclaimer in the
   *    documentation and/or other materials provided with the distribution.
   *
   * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS''
   * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
   * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
   * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS
   * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
   * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
   * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
   * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
   * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
   * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
   * POSSIBILITY OF SUCH DAMAGE.
   *
   * Java, the Duke mascot, and all variants of Sun's Java "steaming coffee
   * cup" logo are trademarks of Sun Microsystems. Sun's, and James Gosling's,
   * pioneering role in inventing and promulgating (and standardizing) the Java
   * language and environment is gratefully acknowledged.
   *
   * The pioneering role of Dennis Ritchie and Bjarne Stroustrup, of AT&T, for
   * inventing predecessor languages C and C++ is also gratefully acknowledged.
   */

  /* Implements the mapping
   * from: AEHIOUWY ÆØÅ BFPVCGJKQSXZDTLMNR
   * to:   00000000 000 111122222222334556
   */
  private static final HashMap<Character, Character> SoundexMapping;

  static
  {
    SoundexMapping = new HashMap<Character, Character>();
    SoundexMapping.put('A', '0');
    SoundexMapping.put('B', '1');
    SoundexMapping.put('C', '2');
    SoundexMapping.put('D', '3');
    SoundexMapping.put('E', '0');
    SoundexMapping.put('F', '1');
    SoundexMapping.put('G', '2');
    SoundexMapping.put('H', '0');
    SoundexMapping.put('I', '0');
    SoundexMapping.put('J', '2');
    SoundexMapping.put('K', '2');
    SoundexMapping.put('L', '4');
    SoundexMapping.put('M', '5');
    SoundexMapping.put('N', '5');
    SoundexMapping.put('O', '0');
    SoundexMapping.put('P', '1');
    SoundexMapping.put('Q', '2');
    SoundexMapping.put('R', '6');
    SoundexMapping.put('S', '2');
    SoundexMapping.put('T', '3');
    SoundexMapping.put('U', '0');
    SoundexMapping.put('V', '1');
    SoundexMapping.put('W', '0');
    SoundexMapping.put('X', '2');
    SoundexMapping.put('Y', '0');
    SoundexMapping.put('Z', '2');
    SoundexMapping.put('Æ', '0');
    SoundexMapping.put('Ø', '0');
    SoundexMapping.put('Å', '0');
  }

  /** Convert the given String to its Soundex code.
   *
   * Soundex - the Soundex Algorithm, as described by Knuth
   * <p>
   * This class implements the soundex algorithm as described by Donald
   * Knuth in Volume 3 of <I>The Art of Computer Programming</I>.  The
   * algorithm is intended to hash words (in particular surnames) into
   * a small space using a simple model which approximates the sound of
   * the word when spoken by an English speaker.  Each word is reduced
   * to a four character string, the first character being an upper case
   * letter and the remaining three being digits. Double letters are
   * collapsed to a single digit.
   *
   * <h2>Examples</h2>
   * Knuth's examples of various names and the soundex codes they map
   * to are:
   * <b>Euler, Ellery -> E460
   * <b>Gauss, Ghosh -> G200
   * <b>Hilbert, Heilbronn -> H416
   * <b>Knuth, Kant -> K530
   * <b>Lloyd, Ladd -> L300
   * <b>Lukasiewicz, Lissajous -> L222
   *
   * <h2>Limitations</h2>
   * As the soundex algorithm was originally used a <B>long</B> time ago
   * in the United States of America, it uses only the English alphabet
   * and pronunciation.
   * <p>
   * As it is mapping a large space (arbitrary length strings) onto a
   * small space (single letter plus 3 digits) no inference can be made
   * about the similarity of two strings which end up with the same
   * soundex code.  For example, both "Hilbert" and "Heilbronn" end up
   * with a soundex code of "H416".
   * <p>
   *
   * Originally written in Perl implementation by Mike Stok (<stok@cybercom.net>) from
   * the description given by Knuth.  Ian Phillips (<ian@pipex.net>) and
   * Rich Pinder (<rpinder@hsc.usc.edu>) supplied ideas and spotted
   * mistakes.
   * <br>Later implemented in Java by Ian Darwin, http://www.darwinsys.com/ (Java Version)
   * Version 1.9 2004/02/23 00:30:49
   *
   * @param s string to calculate soundex code from
   * @return null if the given string can't be mapped to Soundex.
   */
  public static String soundex(final String s)
  {

    // Algorithm works on uppercase (mainframe era).
    String t = s.toUpperCase();

    StringBuffer res = new StringBuffer();
    char c;
    char prev = '?';

    // Main loop: find up to 4 chars that map.
    for (int i=0; i<t.length() && res.length() < 4 && (c = t.charAt(i)) != ','; i++)
    {

      // Check to see if the given character is alphabetic.
      // Text is already converted to uppercase. Algorithm
      // only handles ASCII letters, do NOT use Character.isLetter()!
      // Also, skip double letters.
      if ( SoundexMapping.containsKey(c) && c != prev)
      {
        prev = c;

        // First char is installed unchanged, for sorting.
        if (i==0)
        {
          res.append(c);
        }
        else
        {
          char m = SoundexMapping.get(c);
          if (m != '0')
          {
            res.append(m);
          }
        }
      }
    }
    if (res.length() == 0)
      return null;
    for (int i=res.length(); i<4; i++)
      res.append('0');
    return res.toString();
  }

  /** Reverse the characters in the string.
   *
   * @param r string with characters in original order
   * @return string with characters in reverse order
   */
  public static String reverse(final String r)
  {
    char[] rev = new char[r.length()];

    int j = r.length()-1;
    for (int i = 0; i < r.length(); i++)
    {
      rev[j] = r.charAt(i);
      j--;
    }
    return new String(rev);
  }


  /** Convert a string to CamelCase - meaning uppercase after space, lowercase otherwise.
   *
   * @param r
   * @return string in CamelCase
   */
  public static String toCamelCase(final String r)
  {
    char[] scc = r.toCharArray();

    boolean sp = true;
    for (int i = 0; i < scc.length; i++)
    {
      if (scc[i] == ' ')
      {
        sp = true;
      }
      else
      {
        if (sp)
        {
          scc[i] = Character.toUpperCase(scc[i]);
        }
        else
        {
          scc[i] = Character.toLowerCase(scc[i]);
        }

        sp = false;
      }
    }
    return new String(scc);
  }

  public static final String PANGRAM_DK = "Høj bly gom vandt fræk sexquiz på wc"; // (Kenneth Rosenkilde)
  public static final String PANGRAM_EN = "The quick brown fox jumps over the lazy dog";
}
