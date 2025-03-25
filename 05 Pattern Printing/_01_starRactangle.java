import java.util.Scanner;

public class _01_starRactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        System.out.println("enter column");
        int col = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
