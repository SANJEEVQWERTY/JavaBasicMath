/*
Take a positive integer input and tell if it is divisible by 5 or 3.
 */
import java.util.Scanner;
public class DivisibleOf_5_Or_3 {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from user ");
        a = sc.nextInt();
        if(a%5==0){
            System.out.println("This is divisible of 5 ");
        }
        else if(a%3==0){
            System.out.println("This is divisible of 3");
        }
        else{
            System.out.println("Number is not divisible of anything");
        }
         if(a%5==0  && a%3==0){
            System.out.println("This is divisible of both 5 and 3");
        }
    }
}
