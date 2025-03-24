import java.util.Scanner;

public class _04_divisibleByThreeOrFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        for(int i = 1; i<=a;i++){
            if(i%3 == 0 || i%5 == 0 ){
                System.out.println(i);
            }
        }
    }
}
