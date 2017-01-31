import java.util.Scanner;

/**
 * Created by Student on 1/30/17.
 */
public class RoomCalc {
    public static void main(String[] args) {


       //1. set up resources
        Scanner scan = new Scanner(System.in);

        //2. output so the user knows what's up
        System.out.println("Welcome to the Perimeter Calculator");

        //3. ask for input


        System.out.print("Please enter width :  ");
        double width = scan.nextDouble();

        System.out.print("Please enter length: ");
        double length = scan.nextDouble();

        //4. perform calculations
        double area = length * width;
        double perimeter = (2 * length + 2 * width);

        //5. output results
        System.out.println("The area is " + area);
        System.out.println("The area is " + perimeter);

    }
}