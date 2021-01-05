package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles: ");
        float noOfMiles = input.nextFloat();
        System.out.println("Enter the amount of gas consumed: ");
        float gasConsumed = input.nextFloat();
        input.close();

        float milesPerGallon = gasConsumed / noOfMiles;
        System.out.println("The miles travelled per gallon is: " + milesPerGallon);

    }
}
