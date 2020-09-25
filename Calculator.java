import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello. Welcome to calculator.");
        Scanner Obj = new Scanner(System.in);
        System.out.println("1 = Additon");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Division");
        System.out.println("4 = Multiplication");
        System.out.print("Select an option: ");
        int userChoice = Obj.nextInt();
        System.out.print("Enter your first number: ");
        int userNumOne = Obj.nextInt();
        System.out.print("Enter your second number: ");
        int userNumTwo = Obj.nextInt();
        Obj.close();

        switch (userChoice) {
            case 1:
                int calcAnswer = userNumOne + userNumTwo;
                String answer = String.format(userNumOne + " + " + userNumTwo + " = " + calcAnswer);
                System.out.println(answer);
                break;
            case 2:
                int calcAnswerTwo = userNumOne - userNumTwo;
                String answerOne = String.format(userNumOne + " - " + userNumTwo + " = " + calcAnswerTwo);
                System.out.println(answerOne);
                break;
            case 3:
                int calcAnswerThree = userNumOne * userNumTwo;
                String answerTwo = String.format(userNumOne + " * " + userNumTwo + " = " + calcAnswerThree);
                System.out.println(answerTwo);
                break;
            case 4:
                int calcAnswerFour = userNumOne / userNumTwo;
                String answerThree = String.format(userNumOne + " / " + userNumTwo + " = " + calcAnswerFour);
                System.out.println(answerThree);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}