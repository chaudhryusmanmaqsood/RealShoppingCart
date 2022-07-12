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
        boolean dummy = true;
        switch (choice) {
            case 1:
//               if(OperationOnCart.searchAndToCart()!= dummy);
//                   System.out.println("Write correct spelling ");
                OperationOnCart.searchAndToCart();
//                System.out.println("Please provide correct spelling");
                break;
            case 2:
               OperationOnCart.viewCart();
               OperationOnCart.totalPrice();

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
