package facade;

import java.util.Scanner;


// purpose: Hides the complexity of a larger system & provides an interface tp the client
// example: JDBC, java libraries & apis.
public class FacadePatternDemo {
    public static void main(String[] args) {

        boolean isExit = false;
        String displayText = """
                Enter your choice:
                    1-> Buy IPhone
                    2-> Buy Samsung
                    3-> Buy Blackberry
                    4-> Exiting
                """;
        Shopkeeper shopkeeper = new Shopkeeper();
        while (!isExit){
            System.out.println(displayText);
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println("Buying IPhone: ");
                    shopkeeper.SaleIPhone();
                    break;

                case 2:
                    System.out.println("Buying Samsung: ");
                    shopkeeper.SaleSamsung();
                    break;

                case 3:
                    System.out.println("Buying Blackberry: ");
                    shopkeeper.SaleBlackberry();
                    break;
                default:
                    System.out.println("Buying nothing.");
                    isExit = true;
                    System.out.println("Exiting...");
            }
        }
    }
}
