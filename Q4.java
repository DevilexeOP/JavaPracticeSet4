import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #4 || Question 4");

        // Q4 -> Write a program to find out the day
        // of the week given the number
        // [1 for monday,2 for tuesday and so on...!]

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter the day of the week :");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    break;
            }

        } finally {
            sc.close();
        }

    }
}
