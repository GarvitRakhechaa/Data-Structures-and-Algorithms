import java.util.Scanner;

public class _03_EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        for(int i = 1; i<=a;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
