import java.util.Scanner;
public class Toilet {
    public static void main(String[] args) {
        System.out.println("This is a toilet.");
        System.out.println("I really didn't know what you expecting When you clicked on 'Toilet.java'");
        Scanner sca = new Scanner(System.in);
        System.out.print("Deposit: ");
        String UserDeposit = sca.nextLine();
        if (UserDeposit == "Pee") {
            System.out.println("");
        }
        else if (UserDeposit == "Poo") {

        }
        sca.close();
    }
}
