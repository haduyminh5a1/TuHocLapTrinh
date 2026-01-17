import java.util.*;
public class test44 {
    static int caculateRetail(int price, int rate){
        int retailPrice = price + (price*rate/100);
        return retailPrice;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        int rate = input.nextInt();
        int retailPrice = caculateRetail(price, rate);
        System.out.print("Your retail price is: " + retailPrice);
    }
}
