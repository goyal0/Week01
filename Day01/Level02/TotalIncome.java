import java.util.Scanner;

class TotalIncome {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary: ");
    
        // Take input for salary
        double salary = sc.nextDouble();  

        System.out.print("Enter the bonus: ");

         // Take input for bonus
        double bonus = sc.nextDouble(); 

        // Compute total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);

    }
}
