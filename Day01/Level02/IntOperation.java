import java.util.Scanner;

class IntOperation {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");

         // Take input for 'a'
        int a = sc.nextInt(); 

        System.out.print("Enter the value of b: ");

       // Take input for 'b'
        int b = sc.nextInt();  

        System.out.print("Enter the value of c: ");
 
        // Take input for 'c'

        int c = sc.nextInt(); 
        // Perform integer operations and store the results
        int result1 = a + b * c;  // a + (b * c)
        int result2 = a * b + c;  // (a * b) + c
        int result3 = c + a / b;  // c + (a / b)
        int result4 = a % b + c;  // (a % b) + c

        // Print the results of the operations
        System.out.println(
            "The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}
