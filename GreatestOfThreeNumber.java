/*
 Take 3 positive integers input and print the greatest of them
 */
import java.util.Scanner;
public class GreatestOfThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number from user ");
        System.out.print("Enter tha value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is greatest");
        }
        else if(b>=a && b>=c){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }
    }

}
