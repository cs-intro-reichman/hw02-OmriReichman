
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		 Boolean g = true;
        Boolean b = true;
        while ( b || g) {
           double x = Math.random();
           if (x>=0.5) {
            System.out.print("b ");
             b = false;
           } if (x<0.5) {
            System.out.print("g ");
             g = false;
           }
        }
   }
}
