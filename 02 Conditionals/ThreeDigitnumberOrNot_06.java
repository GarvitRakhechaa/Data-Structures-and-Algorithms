import java.util.Scanner;

public class ThreeDigitnumberOrNot_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            System.out.println(a + " is three digit number");
        }else if(a>9999 && a<100000){
            System.out.println(a + " is a five digit number");
        }else{
            System.out.println(a +" is not five and 3digit both number");
        }


    }
}
