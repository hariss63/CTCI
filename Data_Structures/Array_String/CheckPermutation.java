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

    if (a_len != b_len)
    {
      return false;
    }

    HashSet<Character> seen = new HashSet<Character>();
    for (int i = 0; i < a_len; i++)
    {
      seen.add(a.charAt(i));
    }
    for (int i = 0; i < b_len; i++)
    {
      if (!seen.contains(b.charAt(i)))
      {
        return false;
      }
    }
    return true;
  }
}


