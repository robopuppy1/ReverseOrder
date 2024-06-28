import java.util.*;
public class Reverse
{
     // reverse function
    public static void reverseArray(int[] val) {
        int start = 0; //start value
        int end = val.length - 1; //end including one less for arrays

        while (start < end) {
            //swaps elements at start and end
            int temp = val[start];
            val[start] = val[end];
            val[end] = temp;

            //moves and swaps
            start++;
            end--;
        }
}
}
