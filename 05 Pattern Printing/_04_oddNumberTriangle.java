import java.util.Scanner;

public class _04_oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++ ){
            int number = 1;
            for(int j = 1; j<= i;j++){
                System.out.print(number+ " ");
                number += 2;
            }
            System.out.println();
        }

        int number = 1;
        for(int i = 1; i <= rows; i++ ){
            for(int j = 1; j<= i;j++){
                System.out.print(number+ " ");
                number += 1;
            }
            System.out.println();
        }

        for(int i =1; i<=rows;i++){
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
