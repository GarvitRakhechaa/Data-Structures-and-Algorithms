import java.util.Scanner;

public class GreatestOfThreeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("finding greated of three number");
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + " is greatest");
            }else{
                System.out.println(c + " is greatest");
            }
        }else{
            if(b>c){
                System.out.println(b + " is greatest");
            }else{
                System.out.println(c + " is greatest");
            }
        }

        System.out.println((a>b) ? (a>c) ? "a is greatest" :"c is greatest" : (b>c) ? "b is greatest ": "c is greatest");
    }
    
    
}
