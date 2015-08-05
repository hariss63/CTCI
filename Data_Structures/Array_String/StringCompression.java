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
    int newLen = newLength(str);
    if (newLen >= str.length())
    {
      return str;
    }
    StringBuilder sb = new StringBuilder(newLen); // final capacity
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
    int compressedLength = 0;
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++)
    {
      countConsecutive++;
      
      /* If next character is different than current, increase the length */
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1))
      {
        compressedLength += 1 + String.valueOf(countConsecutive).length();
        countConsecutive = 0;
      }
      return compressedLength;
    }
  }
}
