import java.util.Scanner;

public class _11_countDigitOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int a = num;
        int b = num;
        int count = 0;
        int sum = 0;
        while (a>0) {
            int rem = a%10;
            a = a/10; //kitni baar divide hoga
            sum = sum + rem;
            count++;
        }
        System.out.println("there are "+count+" digits in number: "+a);
        System.out.println("sum of digit is "+ sum);
    }
}
