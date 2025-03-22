import java.util.Scanner;

public class SumofTwoInputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter second number");
        double b = sc.nextDouble();

        System.out.println("sum of two number is = "+ (a+b));

    }
}
