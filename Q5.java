import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #4 || Question 5");

        // Q5 -> Write a Java program to find whether the Year
        // entered by the user is leap year or not

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter the year :");
            int a = sc.nextInt();
            if (a % 4 == 0) {
                System.out.println("This is a leap year -" + a);
            } else {
                System.out.println("Not a leap year -" + a);
            }

        } finally {
            sc.close();
        }

    }
}
