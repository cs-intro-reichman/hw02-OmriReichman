/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		 int T = Integer.parseInt(args[0]);
        int two = 0;
        int three = 0;
        int four = 0;
        int total = 0;
       
        for (int i=0; i<T;i++) {
            Boolean g = true;
        Boolean b = true;
        int n = 0;
        
        while ( b || g) {
           double x = Math.random();
           if (x>=0.5) {
             b = false;
           } if (x<0.5) {
             g = false;
           }
              n++;
              total++;
               if ((n==2) && (g==false) && (b==false)) {
            two++;
        } else if ((n==3) && (g==false) && (b==false)) {
            three++;
        } else if ((n>=4) && (g==false) && (b==false)) {
            four++;
        }
         }
        }
        double average = (double) total/T;
        System.out.println("Average: " + average + " children to get at least one of each gender." );
        System.out.println("Number of families with 2 children: " + two);
        System.out.println("Number of families with 3 children: " + three);
        System.out.println("Number of families with 4 or more children: " + four);
         if (two>=three && two>=four) {
            System.out.println("The most common number of children is 2.");
        } else if (three>two && three>=four) {
            System.out.println("The most common number of children is 3.");
        } else {
            System.out.println("The most common number of children is 4 or more.");
        }
	}
}
