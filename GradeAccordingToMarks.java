/*
Take input percentage of a student and print the grade according to marks
 1)  81 - 100  Very Good
 2)  61 - 80   Good
 3)  41 - 60   Average
 4)  <=40      Fail
 */

import java.util.Scanner;
public class GradeAccordingToMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student ");
        int marks = sc.nextInt();
        if(marks>81 && marks<=100){
            System.out.println("Very Good");
        }
        else if(marks>60 && marks<=80){
            System.out.println("Good");
        }
        else if(marks>40 && marks<=60){
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
