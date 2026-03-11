import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String fromCity;
        String viaCity;
        String toCity;

        double fromToVia;
        double viaToFinalCity;

        double timeFromToVia;
        double timeViaToFinalCity;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter starting city: ");
        fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        viaCity = sc.nextLine();

        System.out.print("Enter destination city: ");
        toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        timeFromToVia = sc.nextDouble();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        timeViaToFinalCity = sc.nextDouble();

        double totalDistance = (fromToVia + viaToFinalCity) * 1.609;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity +
                " to " + toCity + " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");
    }
}