package ShoppingCart;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {


        boolean again = true;
        while (again) {
        OperationOnCart.printOptions();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
               OperationOnCart.searchAndToCart();
                break;
            case 2:
               OperationOnCart.viewCart();
                break;

            case 0:
                again = false;
                System.out.println("Thank you for using UMS.");
            default:
                System.out.println("Please provide valid input");
        }
    }

    }
}
