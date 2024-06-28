import java.util.*; //imports java util
public class ReverseOrder
{
    public int temp; //temp public variable
    public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; //original array
    
    System.out.println( "Original Array: " //prints original
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
    
    Reverse.reverseArray(val); //applies reverse method
 
 
    System.out.println( "Reversed Array: "  //prints reverse array
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}
/* Sample Output
Original Array: 0 1 2 3
Reversed Array: 3 2 1 0
 */
