import javax.swing.JOptionPane;
public class test2 {
    public static void main(String[] args) 
    {   String name;
        int age;
        String inputString;
        Double annualPay;
        //Get the user's name
        name =  JOptionPane.showInputDialog("What is " + "your name");
        //Get the user's age
        inputString = JOptionPane.showInputDialog("How old " + "are you");       
        age = Integer.parseInt(inputString);
        //Get the user's expecting annual pay
        inputString = JOptionPane.showInputDialog("What is your " + "expecting annual pay");
        annualPay = Double.parseDouble(inputString);
        JOptionPane.showMessageDialog(null, "My name is " + name + ", my age is " + age + " and\n" + "I hope to earn $" + annualPay + " per year");
        System.exit(0);
    }

}
