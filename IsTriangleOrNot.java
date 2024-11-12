/*
 Take 3 numbers input and tell if they are made triangle or not
 */
import java.util.Scanner;
public class IsTriangleOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three side of triangle ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c   && b+c>a   && a+c>b){
            System.out.println("This is a triangle ");
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}
