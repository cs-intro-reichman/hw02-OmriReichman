/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
        int z=0;
        String s = "1";
        for (int i = 1; i<N; i++) {
            if (N%i==0) {
             z = z + i;
             if (i!=1) {
              s = s +" + " + i;
             }
            }
        }
       if (N==z) {
        System.out.println(N + " is a perfect number since " + N + " = " + s);
       }else {
            System.out.println(N + " is not a perfect number");
        }
  }
}
