import java.util.Scanner;

public class FindQuadrant_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter point of x axis");
        int a = sc.nextInt();
        System.out.println("enter point of y axis");
        int b = sc.nextInt();

        if(a>0 && b>0){
            System.out.println("("+a+","+b+") is in first quadrant");
        }else if(a<0 && b>0){
            System.out.println("("+a+","+b+") is in second quadrant");
        }else if(a<0 && b<0){
            System.out.println("("+a+","+b+") is in third quadrant");
        }else if(a>0 && b<0){
            System.out.println("("+a+","+b+") is in fourth quadrant");
        }else{
            System.out.println("("+a+","+b+") is at center point");
        }
    }
}
