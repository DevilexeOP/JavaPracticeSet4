import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #4 || Question 3");

        // Q3 -> Calculate the income tax paid by an employee to the government
        // as per the given slabs
        // IncomeSlab Tax
        // 2.5L - 5.0L - 5%
        // 5.0L - 10.0L - 20%
        // Above 10.0L - 30%

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter your salary :");
            float tax = 0;
            float income = sc.nextFloat();
            if (income <= 2.5f) {
                tax = tax + 0;
            } else if (income > 2.5f && income >= 5.0f) {
                tax = tax + 0.05f * (income - 2.5f);
            } else if (income > 5f && income >= 10f) {
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.2f * (income - 5f);
            } else if (income >= 10f) {
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.2f * (income - 5f);
                tax = tax + 0.3f * (income - 10f);
            }

            System.out.println("Tax paid: " + tax);

        } finally {
            sc.close();
        }
    }
}
