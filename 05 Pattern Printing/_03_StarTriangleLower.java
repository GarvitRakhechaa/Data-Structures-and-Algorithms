import java.util.Scanner;

public class _03_StarTriangleLower {
    public static void main(String[] args) {
        char ch = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int o = 0; o<rows; o++){
            for(int p = 1; p<=rows-o; p++){
                System.out.print(p+" ");
            }
            System.out.println();
        }



        for(int o = 0; o<rows; o++){
            for(int p = 0; p<rows-o; p++){
                System.out.print((char)(ch + p)+ " ");
            }
            System.out.println();
        }

        for(int o = 1; o<=rows; o++){
            for(int p = 0; p<=rows-o; p++){
                System.out.print(o+" ");
            }
            System.out.println();
        }
    }
}
