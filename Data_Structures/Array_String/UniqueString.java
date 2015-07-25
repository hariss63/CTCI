import java.util.HashSet;

public class UniqueString {
 public static void main(String[] args) {
  System.out.println(solve(args[0]));
 } 

 public static boolean solve(String str) {
   if (str.length() > 128)
     return false;

   HashSet<Character> seen = new HashSet<Character>();
   for (int i = 0; i < str.length(); i++) {
     char c = str.charAt(i);
     if (seen.contains(c)) {
       return false;
     }
     else {
       seen.add(c);
     }
   }
   return true;
 }
}
