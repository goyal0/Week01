import java.util.Scanner;

class QuotientAndRemainder {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

               System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();  // Take the first number as input

        System.out.print("Enter the second number: ");

       // Take the second number as input
        int number2 = sc.nextInt();  

        // Calculate the quotient and remainder
        int quotient = number1 / number2;  // Division for quotient
        int remainder = number1 % number2;  // Modulus for remainder

        // Print the results
        System.out.println(
            "The Quotient is " + quotient + 
            " and Reminder is " + remainder + 
            " of two numbers " + number1 + " and " + number2
        );

    }
}
