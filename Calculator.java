import java.util.Scanner;

/**
 * Lab05c - Simple Calculator Program
 * @author Eylul Badem
 * @version 24.11.2020
*/ 
public class Lab05c
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);

        // Variables
        
        double sum = 0.0;
        String again = "continue"; 
        
        // Program Code
        
        while(!again.equals( "Quit"))
        {
            // 1-Print out a welcome message and their selection options to the user
            System.out.println("--------------------------------------------");
            System.out.println( "Welcome to SimpleCalc...");
            System.out.println();
            System.out.println( "+-*/ value");
            System.out.println( "Clear");
            System.out.println( "Quit");
            System.out.println();
        
        // 2-Ask for the user to select from options above
        System.out.println( "Select: ");
        String operator = scan.next();
        
        if (operator.equals( "+"))
        {
            // 2.1-Add the value with the sum if the chosen operator is +
            double value = scan.nextDouble();
            sum = sum + value;
            System.out.println( "your answer is:" + (sum));
        }
        else if  (operator.equals("-"))
        {
            // 2.2-Extract the value from the sum if the chosen operator is -
            double value = scan.nextDouble();
            sum = sum - value;
            System.out.println( "your answer is:" + (sum));
        }
        else if (operator.equals( "/"))
        {
            // 2.3-Divide the sum with the value if the chosen operator is /
            double value = scan.nextDouble();
            sum = sum / value;
            System.out.println( "your answer is:" + (sum));
        }
        else if (operator.equals( "*"))
        {
            // 2.4-Multiply the value with the sum if the chosen operator is *
            double value = scan.nextDouble();
            sum = sum * value;
            System.out.println( "your answer is:" + (sum));
        }
        else if ( operator.equals( "Clear") || operator.equals( "clear") || operator.equals( "C") || operator.equals( "c"))
        {
            // 2.5-Clear the previous operations and print out the sum as zero if user chose clear instead of an operator
            sum = 0;
            System.out.println( sum);
        }
        else 
        {
            // 2.6-Print out an error messagge if the operator is not invalid
            System.out.println( "Sorry, this is not an operator");
        }
        
        //  3-Ask the user if they want to continue computing
        System.out.println( "Do you want to quit or continue?");
        again = scan.next();
        } 
       
        // 4-Print out a goodbye message if the user wants to quit
        System.out.println();
        System.out.print( "Thanks for using SimpleCalc, goodbye.");  
        
        scan.close();
    }
}