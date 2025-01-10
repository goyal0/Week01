import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time period in years: ");
        double time = sc.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }
}
