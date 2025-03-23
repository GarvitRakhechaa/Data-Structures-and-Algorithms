import java.util.Scanner;

public class GradeOfStudent_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();
        if(marks>80 && marks < 100){
            System.out.println("very good");
        }else if(marks<=80 && marks>60){
            System.out.println("Good");
        }else if(marks<=60 && marks>40){
            System.out.println("Average");
        }else{
            System.out.println("Fail");
        }
    }
    
}
