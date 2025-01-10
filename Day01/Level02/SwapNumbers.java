import java.util.Scanner;

class SwapNumbers {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();  // Take input for first number

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();  // Take input for second number

        // Swap the values of number1 and number2
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
