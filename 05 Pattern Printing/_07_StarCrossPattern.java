import java.util.Scanner;

public class _07_StarCrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows;i++){
            for(int j = 1; j<=rows;j++){
                if(i==j || i+j == (rows+1)){
                    System.out.print("* ");
                    // System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
