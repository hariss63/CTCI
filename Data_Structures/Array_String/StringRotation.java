public class StringRotation
{
  public static void main(String[] args)
  {
    System.out.println(solve(args[0], args[1]));
  }
	
  public static boolean solve(String s1, String s2)
  {
    if (s1.length() != s2.length())
    {
      return false;
    }
    return isSubstring(s2, s1+s1);
  }
	
  static boolean isSubstring(String s1, String s2)
  {
    return s2.contains(s1);
  }
}
