import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        System.out.println("Find the Simple Interest ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount ");
        int p = sc.nextInt();
        System.out.println("Enter the Rate ");
        float r = sc.nextFloat();
        System.out.println("Enter the Time Period ");
        int t  = sc.nextInt();
        double SI = ( p * r * t)/100.0;
        System.out.println("Simple Interest is " +SI);
    }
}
