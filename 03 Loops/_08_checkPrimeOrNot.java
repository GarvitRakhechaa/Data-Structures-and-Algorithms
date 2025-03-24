import java.util.Scanner;

public class _08_checkPrimeOrNot {
    
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                n = 1;
                break;
            }
        }
        if(n == 1){
            System.out.println(num +" is composit number");
        }
        else{
            System.out.println(num + " is prime number");
        }
    }
}
