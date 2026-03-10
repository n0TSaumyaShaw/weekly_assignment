import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Harry's age is " + age);

        sc.close();
    }
}Q1