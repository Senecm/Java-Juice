import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        System.out.println("This calculator will calculate (who knew!) interest.");
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        int P = Input.nextInt();
        System.out.print("Enter the Rate: ");
        int I = Input.nextInt();
        System.out.print("Enter the Duration (in years): ");
        int N = Input.nextInt();
        Input.close();
        Calculator(P, I, N);
    }
    public static String Calculator(int P, int I, int N) {
        int cal = (P) * (I) * (N); 
        String Interest = String.format("Interest = " + cal);
        return Interest;
    }
} //
