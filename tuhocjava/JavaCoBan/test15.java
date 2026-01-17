
import java.text.DecimalFormat;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = Math.pow(b,2)-(4*a*c);
        DecimalFormat df = new DecimalFormat("0.##");
        if (a!=0)
        {
        if (d>0)
        {
            double x1=(-b-Math.sqrt(d))/(2*a), x2=(-b+Math.sqrt(d))/(2*a);
            String n1 = df.format(x1); String n2 = df.format(x2);
            if (x1>x2)
            System.out.println(n2 + " " + n1);
            else if (x1<x2)
            System.out.println(n1 + " " + n2);

        }
        else if (d<0)
        {
            System.out.println("pt vo nghiem");
        }
        else if (d==0)
        {
            double x=-b/(2*a);
            String nkep = df.format(x);
            System.out.println(nkep);
        }
        }
        else if (a==0)
            if (b==0 && c==0)
            System.out.println("pt vo so nghiem");
            else {
            if (b==0 && c!=0){
                System.out.println("pt vo nghiem");
            }
            else {
                double x=-c/b;
                String nghiem = df.format(x);
                System.out.println(nghiem);
            }
            }
    }
}
