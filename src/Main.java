import javax.swing.*;
import java.util.Random;  // at the top before the main
import java.util.Scanner;
import static java.lang.System.in;

public class Main
{
    public static void main(String[] args)
    {

        Random generator = new Random(); // I usually call it rnd or gen
        int val = generator.nextInt(10) + 1;  // val is 1 to 10
        Scanner in = new Scanner(System.in);
        int num = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do
        {
            System.out.print("Enter a number [1-10]: ");
            if(in.hasNextInt())// is integer?
            {
                num = in.nextInt();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a int so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number.");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        System.out.println("The random number is: " + val);
        System.out.println("You entered: " + num);
        if (num>val && num>=0 && num<=10)
        {
            done = true;
            System.out.println("Your number is high!");
        }
        if (num<val && num>=0 && num<=10)
        {
            done = true;
            System.out.println("Your number is low!");
        }
        if (num==val && num>=0 && num<=10)
        {
            done = true;
            System.out.println("Your number is on the money!");
        }
        if (num<=0 || num >=10)
        {
            done = true;
            System.out.println("You entered a number out of range. Try again!");
        }
    }
}