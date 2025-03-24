import java.util.Scanner;

public class _02_oneToHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        for(int i = 1; i<=a;i++){
            System.out.println(i);
        }
    }
}
