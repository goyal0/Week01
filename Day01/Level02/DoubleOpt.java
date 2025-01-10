import java.util.Scanner;

class DoubleOpt {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");

          // Take input for 'a'
        double a = sc.nextDouble(); 

        System.out.print("Enter the value of b: ");

          // Take input for 'b'
        double b = sc.nextDouble(); 

        System.out.print("Enter the value of c: ");

         // Take input for 'c'
        double c = sc.nextDouble(); 

        // Perform double operations and store the results
        double result1 = a + b * c;  // a + (b * c)
        double result2 = a * b + c;  // (a * b) + c
        double result3 = c + a / b;  // c + (a / b)
        double result4 = a % b + c;  // (a % b) + c

        // Print the results of the operations
        System.out.println(
            "The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}
