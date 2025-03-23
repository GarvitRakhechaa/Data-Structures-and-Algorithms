import java.util.Scanner;

public class DivisibleBythreeOrFive_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        if(a%3 == 0 && a%5 ==0){
            System.out.println(a +" is divisble by 3 and 5 both");
        }else if(a%3 == 0 || a%5 ==0){
            System.out.println(a +" is divisible from only 3 or 5");
            if(a%3 == 0){
                System.out.println(a +" is divisible by 3");
            }else{
                System.out.println(a+" is divisible by 5");
            }
        }
    }
}
