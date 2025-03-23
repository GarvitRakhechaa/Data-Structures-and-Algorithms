import java.util.Scanner;

public class AbsoluteValue_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("absolute value of "+ a + " is "+-a);
        }
        else{
            System.out.println("absolute value of "+ a + " is "+a);
        }
    }
}
