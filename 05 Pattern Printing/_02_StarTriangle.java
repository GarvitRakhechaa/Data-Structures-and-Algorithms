import java.util.Scanner;

public class _02_StarTriangle {
    public static void main(String[] args) {
        // System.out.println(char(int("A")+1));
        char ch = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.println("Star Lower Triangle");
        System.out.println("enter rows");
        int rows = sc.nextInt();
        // System.out.println("enter column");
        // int col = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int m = 1; m<=rows; m++){
            for(int n = 1; n<=m; n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }

        for(int k = 1; k<=rows; k++){
            for(int l = 0; l<k; l++){
                System.out.print((char)(ch + l)+ " ");
            }
            System.out.println();
        }

        for(int o = 1; o<=rows; o++){
            for(int p = 0; p<o; p++){
                System.out.print(o+" ");
            }
            System.out.println();
        }
        System.out.println();

        // for(int i = 1; i<=rows;i++){
        //     for(int j = 0; j<1; j++){
        //         if(i%2!=0){
        //             System.out.print((char)(ch+j)+ " ");
        //         }else{
        //             System.out.print(j+1+" ");
        //         }
        //     }
        //     System.out.println();
        // }



    }
}
