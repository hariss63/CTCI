public class URLify
{
  public static void main(String[] args)
  {
    System.out.println(solve(args[0], Integer.parseInt(args[1])));
  }

  public static String solve(String str, int str_len)
  {
    char[] s_arr = str.toCharArray();
    for (int i = 0; i < str_len; i++)
    {
      if (s_arr[i] == ' ')
      {
        shunt(s_arr, i, 2);
        s_arr[i] = '%';
        s_arr[i+1] ='2';
        s_arr[i+2] = '0';
      }
    }
    return new String(s_arr);
  }


  public static void shunt(char[] str, int index, int amount)
  {
    for (int i = str.length - (1 + amount); i > index; i--)
    {
      str[i+amount] = str[i];
    }
  }
}
