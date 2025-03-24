import java.util.Scanner;

public class _07_chechCompositNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check that it is composit or not");
        int num = sc.nextInt();

        for(int i = 2 ; i<num;i++){
            if(num%i == 0){
                System.out.println(num + " is composit number");
                break;
            }

        }
            
    }
}
