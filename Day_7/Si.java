package Day_7;
import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the annual interest rate (in percentage): ");
        double r = sc.nextDouble();
        System.out.println("Enter the time (in years): ");
        int t = sc.nextInt();

        double simpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
