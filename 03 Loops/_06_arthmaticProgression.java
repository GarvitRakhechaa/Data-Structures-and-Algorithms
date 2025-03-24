import java.util.Scanner;

public class _06_arthmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a progression number:");
        int progression = sc.nextInt();
        System.out.println("enter a number of terms:");
        int terms = sc.nextInt();
        int num = 1;
        System.out.println("AP Series");
        for(int i = 1; i<=terms;i++){
            System.out.println(num);
            num = num + progression;
        }
        num = 1;
        System.out.println();
        System.out.println("GP series");
        for(int i = 1; i<=terms;i++){
            System.out.println(num);
            num = num * progression;
        }

    }
    
}
