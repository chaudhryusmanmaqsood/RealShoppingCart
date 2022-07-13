package ShoppingCart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OperationOnCart {

    public static void printOptions() {
        System.out.println("Press 1 search product name : ");
        System.out.println("Press 2 to view cart : ");

    }

    public static void searchAndToCart() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product name for search : ");
        String userInput = sc.nextLine();
        String line = " ";
//        String userInput = "Milk Pack";
        Scanner scan = null;

//       boolean again = true;
//       while (again){
        try {
            File myFile = new File("D:\\ShoppingCart\\RealShoppingCart\\src\\ShoppingCart.txt");
            scan = new Scanner(myFile);
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                if (line.startsWith(userInput)) {
                    System.out.println(line);
                    System.out.println("If you want add to cart this product press 1 else press any number : ");
                    int option = sc.nextInt();
                    if (option == 1) {
                        try {
                            FileWriter fileWriter = new FileWriter("DummyFile", true);
//                            BufferedWriter b = new BufferedWriter(fileWriter);
                            fileWriter.write(line + "\n");
//                            b.write(line);
//                            b.newLine();
                            fileWriter.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
            scan.close();

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        }
    }

    // View to cart
    public static void viewCart() {
        File myFile = new File("DummyFile");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void totalPrice() {

//        int number = 0;
         int  number = 0;
         int sum = 0;
        String line1 = "";
        String name = "Price";
        File myFile = new File("DummyFile");
        try {
//                    AddToCart price = new AddToCart();

            for(int i=1; i<=70; i++){
                 System.out.print("-");
             }
            System.out.print("\n");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNext()){
                String line = sc.next();
                if(line.equals(name)){
                    line1 = sc.next();
                    number = Integer.parseInt(line1);
                    sum = sum + number;
//                    System.out.println(Integer.sum(number));
                  //        OperationOnCart price = new OperationOnCart();
//                    price.setPrice(sum);


//                    System.out.println(sum);

//                    price.setValue(sum);
                }
            }
            System.out.print("Your total bill is : " + sum + "\n");
//                    System.out.println(sum);
//                    System.out.println("Total price is :");
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//         return sum;
                // Add to cart

//    public static void addToCart(){
//            AddToCart cart = new AddToCart();
//            cart.setProductName(OperationOnCart.getCustomerInput("Enter Product name : "));
//            cart.setPrice(OperationOnCart.getCustomerInput("Enter price: "));
//            cart.setInStock(OperationOnCart.getCustomerInput("Enter quantity of stock : "));
//
//
//            try {
//                FileWriter fileWriter = new FileWriter("DummyFile");
////            FileHandleUms.inputCourseDetails();
//                fileWriter.write(cart.getProductName() + "," + " Price " + " = " + cart.getPrice()
//                        + ", " + " In-stock "+ " = " + cart.getInStock() + "\n");
////                fileWriter.write(cart.getPrice() + "\n");
////                fileWriter.write(cart.getInStock() + "\n");
//
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//
//            }
//
//        }


//        private static String getCustomerInput(String message){
//
//            Scanner sc = new Scanner(System.in);
//            System.out.print(message);
//
//            return sc.nextLine();
//        }

    }
    public static void price(){
////        OperationOnCart price = new OperationOnCart();
        AddToCart price = new AddToCart();
                    System.out.println(price.getPrice());
////        System.out.println(price.sum);
////
    }

}
