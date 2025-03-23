import java.util.Scanner;

public class ProfitLoss_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price ");
        double cp = sc.nextDouble();
        System.out.println("enter selling price ");
        double sp = sc.nextDouble();

        if(sp>cp){
            System.out.println("profit is "+ (sp-cp));
        }else if(cp>sp){
            System.out.println("loss is "+ (cp-sp));
        }else{
            System.out.println("you are in condition of no profit no loss");
        }
    }
}
