/*
 Take 3 positive integers input and print the least of them
 */
import java.util.Scanner;
public class leastOfThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a is :  ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b is :  ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c is :  ");
        int c = sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("a is least ");
        }
        else if(b<=a && b<=c){
            System.out.println("b is least");
        }
        else{
            System.out.println("c is least");
        }
    }
}
