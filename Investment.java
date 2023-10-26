import java.util.*;
import java.text.*;
public class Investment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Buying Price :");
        double buyingprice = sc.nextDouble();
        int day =1;
        double closingprice =0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true){
            System.out.println("Enter the closing price for the day "+ day + "  (any negative value to leave)");
            closingprice = sc.nextDouble();
            if (closingprice<0.0) break;
            double earnings = closingprice - buyingprice;
            if (earnings>0.0){
                System.out.println("After day "+day+" you earned " +df.format(earnings)+" per share");
            }
            else if(earnings<0.0){
                 System.out.println("After day "+day+" you lost " +df.format(-earnings)+" per share");
            }
            else {
                 System.out.println("After day"+day+"you have no earnings per share");
            }
            day+=1;
        }
    }
}
