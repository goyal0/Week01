import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // get input number of Students
        System.out.println("Enter number of student: ");
        int numberOfStudent = input.nextInt();

        int totalHandShakes = (numberOfStudent - 1) * numberOfStudent / 2;

        System.out.println("Total Handshakes: " + totalHandShakes);
        input.close();
    }
}
