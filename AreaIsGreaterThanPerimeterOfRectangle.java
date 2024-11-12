/*
 Given the length and breath of a rectangle .Write a program to find whether the area of rectangle is greater than its perimeter
 */
import java.util.Scanner;
public class AreaIsGreaterThanPerimeterOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle ");
        int l = sc.nextInt();
        System.out.println("Enter the breath of rectangle ");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2 * (l+b);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter of rectangle");
        }
        else {
            System.out.println("Area is not greater than perimeter of reactangle");
        }
    }
}
