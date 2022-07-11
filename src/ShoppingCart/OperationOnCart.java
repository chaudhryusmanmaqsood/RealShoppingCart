package ShoppingCart;

import java.io.*;
import java.util.Scanner;

public class OperationOnCart {

  public static void printOptions(){
      System.out.println("Press 1 search product name : ");
      System.out.println("Press 2 to view cart : ");

  }

    public static void searchAndToCart(){
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
            while(scan.hasNextLine()){
                line = scan.nextLine();
                if(line.startsWith(userInput) ) {
                    System.out.println(line);
                    System.out.println("If you want add to cart this product press 1 : ");
                    int option = sc.nextInt();
                    if(option == 1){
                        try {
                            FileWriter fileWriter = new FileWriter("DummyFile",true);
//                            BufferedWriter b = new BufferedWriter(fileWriter);
                            fileWriter.write(line +"\n");
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
    public static void viewCart(){
        File myFile = new File("DummyFile");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }





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
