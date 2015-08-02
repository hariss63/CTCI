/*
 * Had to update this, because the HashSet approach is actually incorrect.
 * To see this, consider the case where the character sets of the two strings
 * are the same, but different letters occur a different number of times.
 */

import java.util.HashSet;

public class CheckPermutation
{
  public static void main(String[] args)
  {
    String a = args[0];
    String b = args[1];
    System.out.println("These strings are " + (solve(a, b) ? "" : "not ") +
        "permutations of each other.");
  }

  public static boolean solve(String a, String b)
  {
    int a_len = a.length();
    int b_len = b.length();
    char[] a_arr = a.toCharArray();
    char[] b_arr = b.toCharArray();

    if (a_len != b_len)
    {
      return false;
    }
    int[] letters = new int[128];

    for (char c: a_arr)
    {
      letters[c]++;
    }

    for (char c: b_arr)
    {
      letters[c]--;
      if (letters[c] < 0)
      {
        return false;
      }
    }

    return true;
  }
}


