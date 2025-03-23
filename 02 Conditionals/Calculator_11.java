import java.util.Scanner;

public class Calculator_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter operation");
        char op = sc.next().charAt(0);
        System.out.println("Enter second number");
        double b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("enterd invalid operation");
                break;
        }
        // sc.close();
    }
}
