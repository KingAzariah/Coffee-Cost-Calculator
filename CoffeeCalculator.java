import java.util.Scanner;

public class CoffeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the quantity of coffee cups
        System.out.print("Enter the quantity of coffee cups: ");
        int quantity = scanner.nextInt();

        // Input the price per cup of coffee
        System.out.print("Enter the price per cup of coffee: $");
        double pricePerCup = scanner.nextDouble();

        // Calculate the total cost
        double totalCost = quantity * pricePerCup;

        // Output the result
        System.out.println("Total cost for " + quantity + " cups of coffee: $" + totalCost);

        // Close the scanner
        scanner.close();
    }
}
