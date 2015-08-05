/*
 * TODO: Strip Whitespaces
 * TODO: lowercase string
 */
public class PalindromePermutation
{
  public static void main(String[] args)
  {
    System.out.println(solve(args[0]));
  }

  public static boolean solve(String str)
  {
    int[] char_count = new int[128]; // assuming ASCII
    boolean foundOdd = false;
    boolean isEven = str.length() % 2 == 0;
    for (int i = 0; i < str.length(); i++)
    {
      int c = (int) (str.charAt(i));
      char_count[c]++;
    }
    for (int num: char_count)
    {
      boolean numEven = num % 2 == 0;
      if (!numEven && (isEven || foundOdd))
      {
        return false;
      }
      else if (!numEven)
      {
        foundOdd = true;
      }
    }
    return true;
  }
}
