import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #4 || Question 2");

        // Q2 -> Find out whether a student is pass or fail
        // if it requires total 40% and at least 33% in each subject to pass
        // Assume 3 subjects and take marks as an input from the user

        // Solution
        // assuming 100 marks for each subject (total 300 marks)

        Scanner sc = new Scanner(System.in);
        try {
            float total = 300f;
            System.out.println("Enter your marks to find you are pass or fail");
            System.out.println("English :");
            float a = sc.nextFloat();
            System.out.println("Science :");
            float b = sc.nextFloat();
            System.out.println("Maths :");
            float c = sc.nextFloat();
            float sum = a + b + c;
            float percent = (sum / total) * 100f;
            System.out.println(percent);

            float pr = 40f;
            if (percent > pr) {
                System.out.println("Pass");
            } else if (percent == pr) {
                System.out.println("Border");
            } else {
                System.out.println("Fail");
            }

            // partially correct way but each subject is also needed (upper one)
            // correct way (lower one)

            byte a1, b1, c1;
            System.out.println("Cs :");
            a1 = sc.nextByte();
            System.out.println("IT :");
            b1 = sc.nextByte();
            System.out.println("EM :");
            c1 = sc.nextByte();

            float avg = (a1 + b1 + c1) / 3.0f; // Integer dived by integer gives integer , we need accuracy so use float
                                               // instead
            System.out.println("Avg marks " + avg);

            if (avg >= 40 && a1 >= 33 && b1 >= 33 && c1 >= 33) {
                System.out.println("ggez");
            } else {
                System.out.println("ggnt");
            }
        } finally {
            sc.close();
        }
    }
}
