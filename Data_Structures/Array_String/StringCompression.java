public class StringCompression
{
  public static void main(String[] args)
  {
    String str = "aabccccaaa";
    solve(str);		
  }
 
  public static String solve(String s)
  {
    String str = s.toLowerCase();
    if (newLength(str) >= str.length())
    {
      return str;
    }
    StringBuilder sb = new StringBuilder();
    int streak = 1;
    for (int i = 1; i < str.length(); i++)
    {
      if (str.charAt(i) == str.charAt(i-1))
      {
        streak++;
      }
      else
      {
        sb.append(str.charAt(i-1));
        sb.append(streak);
        streak = 1;
      }
    }
    sb.append(str.charAt(str.length() - 1));
    sb.append(streak);
    return sb.toString();
  }
  private static int newLength(String str)
  {
    if (str.length() <= 2)
    {
      return 2;
    }
    int streakCount = 1;
    for (int i = 1; i < str.length(); i++)
    {
      if (str.charAt(i) != str.charAt(i-1))
      {
        streakCount++;
      }
    }
    return 2 * streakCount;
  }
}
