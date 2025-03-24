import java.util.Scanner;

public class _09_EvenOddNumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing odd numbers from 1 to 100");        
        for(int i = 1; i<=100; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing even numbers from 1 to 100");
        for(int j = 1;j<=100;j++){
            if(j%2 == 0){
            System.out.print(j + " ");

            }
        }
    }
}
