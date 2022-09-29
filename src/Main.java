import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String panel = "============";
        DecimalFormat dollarFormat = new DecimalFormat("#.00");
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the cost of your bill: ");
        double bill = input.nextDouble();
        System.out.print("Please input the percentage of your tip as a whole number: ");
        int tip = input.nextInt();
        System.out.print("Please input the number of people splitting the bill: ");
        int numPeople = input.nextInt();
        // Output calculations
        double totalTip = (int) (bill * tip) / 100.00;
        double tipPerPerson = (int) (totalTip * 100 / numPeople) / 100.00;
        double totalBill = (int) ((bill + totalTip) * 100) / 100.00;
        double totalPerPerson = (int) (totalBill / numPeople * 100) / 100.00;
        // Display
        System.out.println(panel);
        System.out.println("Total tip amount: $" + dollarFormat.format(totalTip));
        System.out.println(panel);
        System.out.println(panel);
        System.out.println("Total bill: $" + dollarFormat.format(totalBill));
        System.out.println(panel);
        System.out.println(panel);
        System.out.println("Tip per person: $" + dollarFormat.format(tipPerPerson));
        System.out.println(panel);
        System.out.println(panel);
        System.out.println("Total cost per person: $" + dollarFormat.format(totalPerPerson));
        System.out.println(panel);
    }
}