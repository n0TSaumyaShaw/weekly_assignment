import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Earth in km: ");
        double radius = sc.nextDouble();

        double volumeKm = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);

        sc.close();
    }
}