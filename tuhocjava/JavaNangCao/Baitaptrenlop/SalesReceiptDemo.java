package JavaNangCao.Baitaptrenlop;

import java.util.Scanner;
import java.io.*;

public class SalesReceiptDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        RetailItem item = new RetailItem("Example Product", 10, 10.00);

        System.out.print("Input quantity: ");
        int qty = keyboard.nextInt();

        CashRegister reg = new CashRegister(item, qty);

        PrintWriter outputFile = new PrintWriter("Receipt.txt");

        outputFile.println("SALES RECEIPT");
        outputFile.printf("Unit Price: $%,.2f\n", reg.getUnitPrice());
        outputFile.printf("Quantity: %d\n", reg.getQuantity());
        outputFile.printf("Subtotal: $%,.2f\n", reg.getSubtotal());
        outputFile.printf("Sales Tax: $%,.2f\n", reg.getTax());
        outputFile.printf("Total: $%,.2f\n", reg.getTotal());

        outputFile.close();
        System.out.println("Biên lai đã được xuất ra file Receipt.txt thành công!");


        keyboard.close();
    }
}
