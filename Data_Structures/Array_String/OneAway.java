public class OneAway
{
  public static void main(String[] args)
  {
    System.out.println(solve(args[0], args[1]));
  }
	
  public static boolean solve(String s1, String s2)
  {
    if (Math.abs(s1.length()- s2.length()) >= 2)
    {
      return false;
    }
    int[] s1_count = new int[128];  // Assumption
    int[] s2_count = new int[128];
    int diff = 0;
    for (int i = 0; i < s1.length(); i++)
    {
      int c = (int) (s1.charAt(i));
      s1_count[c]++;
    }
    for (int i = 0; i < s2.length(); i++)
    {
      int c = (int) (s2.charAt(i));
      s2_count[c]++;
    }
    for (int i = 0; i < 128; i++)
    {
       diff += Math.abs(s1_count[i] - s2_count[i]);
    }
    return diff <= 2;
  }
}
