import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of pens: ");
        int pens = sc.nextInt();

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int penPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + penPerStudent +
                " and the remaining pen not distributed is " + remainingPens);

        sc.close();
    }
}