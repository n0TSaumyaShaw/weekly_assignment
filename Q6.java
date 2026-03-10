import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discount;

        System.out.println("The discount amount is INR " + discount);
        System.out.println("The discounted price the student will pay is INR " + discountedPrice);

        sc.close();
    }
}