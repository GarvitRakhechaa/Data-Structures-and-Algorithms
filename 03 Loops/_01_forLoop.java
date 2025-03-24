import java.util.Scanner;

public class _01_forLoop {
    public static void main(String[] args) {
        // print n time garvit
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        for(int i = 1; i<=a;i++){
            System.out.println(i + " Garvit");
        }
    }
    
}
