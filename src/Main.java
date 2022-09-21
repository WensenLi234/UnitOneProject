import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the cost of your bill: ");
        double bill = input.nextDouble();
        System.out.print("Please input the percentage of your tip as a whole number: ");
        int tip = input.nextInt();
        System.out.print("Please input the number of people splitting the bill: ");
        int numPeople = input.nextInt();
        // Output calculations
        double costPerPerson = (int) (bill / numPeople * 100 + .9);
        double tipPerPerson = costPerPerson * tip / 100;
        // Display
        System.out.println(costPerPerson);
    }
}