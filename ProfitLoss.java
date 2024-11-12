import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        System.out.println("Find Profit and Loss");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();
        float profit = ((sp - cp) * 100)/cp;
        float loss = ((cp -sp) * 100)/cp;
                if(sp>cp){
                    System.out.println("Seller has got profit on the item "+profit+"%");
                }
                else if(cp>sp){
                    System.out.println("Seller has got loss on the item "+loss+"%");
                }
                else{
                    System.out.println("Seller has got no profit and no loss");
                }
    }
}
