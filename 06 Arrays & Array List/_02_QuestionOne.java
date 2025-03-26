// Q1 : Given an array of marks of students, if the mark of any
// student is less than 35 print its roll number. [roll number
// here refers to the index of the array.

import java.util.Scanner;

public class _02_QuestionOne {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        int[] marks = {45, 30, 60, 25, 90, 33, 50, 20};
        System.out.println("Students with marks less than 35:");
        for(int i = 0; i < marks.length; i++ ){
            if(marks[i]<35)
              System.out.println("Roll Number: "+i+1 +" | Marks: "+marks[i]);
        }

    }
}
