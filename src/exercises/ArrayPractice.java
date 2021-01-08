package exercises;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class ArrayPractice {

    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

        // Loop to print all values of the array.
        System.out.println("All the numbers in my array are: ");
        for (int i=0; i< myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        //Loop to print only odd numbers:
        System.out.println("Odd numbers in my array are: ");
        for (int j=0;j< myArray.length;j++){
            if (myArray[j] % 2 != 0 ) {
                System.out.println(myArray[j]);
            } else {
                continue;
            }
        }

        // Splitting the input string with space as delimiter.
        String[] spaceOutput = myString.split("\\s");
        System.out.println("The string after splitting with space delimiter: " + Arrays.toString(spaceOutput));

        //Splitting the input string with comma as delimiter.
        String[] commaOutput = myString.split(",");
        System.out.println("The string after splitting with comma delimiter: " + Arrays.toString(commaOutput));

        //Splitting the input string with period as delimiter.
        String[] periodOutput = myString.split("\\.");
        System.out.println("The string after splitting with period delimiter: " + Arrays.toString(periodOutput));
    }
}
