import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #4 || Question 6");

        // Q6 -> Write a program to find out the type of website from the Url
        // .com => Commercial website
        // .org => Organization website
        // .in => Indian website

        Scanner sc = new Scanner(System.in);
        try {
            String website = sc.next();
            if (website.endsWith(".com")) {
                System.out.println("Commercial website");
            } else if (website.endsWith(".org")) {
                System.out.println("Organization website");
            } else if (website.endsWith(".in")) {
                System.out.println("Indian website");
            } else {
                System.out.println("None");
            }

        } finally {
            sc.close();
        }
    }
}
