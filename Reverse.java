/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		 String s = args[0];
        int i = 0;
        int n = s.length();
        String reverse = "";
        char m = s.charAt((n-1)/2);
        while (i<n) {
           char c = s.charAt(n-1-i);
          reverse = reverse + c;
          i++;
        }
        System.out.println(reverse);
        System.out.println("The middle character is " + m);
  }
}
