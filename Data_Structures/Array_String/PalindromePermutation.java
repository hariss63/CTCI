public class PalindromePermutation
{
  public static void main(String[] args)
  {
    System.out.println(solve("args[0]"));
  }

  public static boolean solve(String str)
  {
    int bitVector = createBitVector(str);
    return bitVector == 0 || checkExactlyOneBitSet(bitVector);
  }
  /* Create a bit vector for the string. For each letter with value i, toggle the ith bit. */
  static int createBitVector(String str)
  {
    int bitVector = 0;
    char[] cArr = str.toCharArray();
    for (char c: cArr)
    {
      int x = getCharNumber(c);
      bitVector = toggle(bitVector, x);
    }
    return bitVector;
  }
  /* Map each character to a number. a -> 0, b ->, etc.
   * Case insensitive. Non-letter characters map to -1 */
  static int getCharNumber(char c)
  {
    if (Character.isUpperCase(c))
    {
      return c - 'A';
    }
    else if (Character.isLowerCase(c))
    {
      return c - 'a';
    }
    return -1;
  }
  
  /* Toggle the ith bit in the integer */
  static int toggle(int bitVector, int index)
  {
    if (index < 0)
    {
      return bitVector;
    }
    
    int mask = 1 << index;
    if ((bitVector & mask) == 0)
    {
      bitVector |= mask;
    }
    else
    {
      bitVector &= ~mask;
    }
    return bitVector;
  }
  
  static boolean checkExactlyOneBitSet(int bitVector)
  {
    return (bitVector & (bitVector - 1)) == 0;
  }
}
