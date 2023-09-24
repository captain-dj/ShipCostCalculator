import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user enters price
        System.out.println("Enter price of item: ");
        double itemPrice = scanner.nextDouble();

    // checks if price is viable for free shipping
      double extaCost;
        if (itemPrice >= 100.0) {
            extaCost = 0.0;
        }
        else {
            extaCost = 0.02 * itemPrice;
        }

        // math
        double totalPrice = itemPrice + extaCost;

        System.out.println("Shipping is: " + extaCost + " ");
        System.out.println("Item is: " + totalPrice + " ");

        scanner.close();
    }
}