import java.util.Scanner;

public class _01_SyntexAndDeclaration {
    public static void main(String[] args) {
        int x = 10;
        int[] y = new int[2]; // declaration of an Array
        // y[2] = 5;
        // System.out.println(y[2]);
        int[] arr = new int[10]; // declaration of an array that can store 10 integer values
        Scanner sc = new Scanner(System.in);



        // System.out.println(arr[4]);
                
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}
