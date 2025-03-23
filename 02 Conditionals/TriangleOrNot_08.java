import java.util.Scanner;

public class TriangleOrNot_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("checking triangle or not");
        System.out.println("enter value of first length of triangle");
        double a = sc.nextDouble();
        System.out.println("enter value of second length of triangle");
        double b = sc.nextDouble();
        System.out.println("enter value of third length of triangle");
        double c = sc.nextDouble();

        // if(a < b + c && b < a + c && c < a + b){
        if((a + b) > c && (a + c) > b && (b + c) > a){
            System.out.println("this is a triangle");
        }else{
            System.out.println("this is not a triangle");
        }
    }
}
