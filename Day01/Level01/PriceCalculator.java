import java.util.Scanner;

class PriceCalculator {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // get price from user
        System.out.println("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // get quantity from user
        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        // calculate purchase price
        double purchasePrice = unitPrice * quantity;

        System.out.println("The total purchase price in INR " + purchasePrice
                + " if the quantity " + quantity
                + " and unit price in INR " + unitPrice);

        input.close();
    }
}