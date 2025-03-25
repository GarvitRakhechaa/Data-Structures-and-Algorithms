import java.util.Scanner;

public class _06_StarPlusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = sc.nextInt();
        for(float i = 1;i<=rows; i++){
            if(i == (float)(rows + 1)/2){
                for(int j = 1; j<=rows; j++){
                    System.out.print("* ");
                }
            }else{
                for(int j = 1; j<=rows; j++){
                    if(j == (rows+1)/2){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
