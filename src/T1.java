import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        double[] temperatures = new double[7];
        Scanner scanner = new Scanner(System.in);

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter temperature for day " + day + ": ");
            temperatures[day - 1] = scanner.nextDouble();
        }
        double highTemp = temperatures[0];
        double lowTemp = temperatures[0];
        for (int day = 1; day < temperatures.length; day++) {
            if (temperatures[day] > highTemp) {
                highTemp = temperatures[day];
            }
            if (temperatures[day] < lowTemp) {
                lowTemp = temperatures[day];
            }
        }

        System.out.println();
        System.out.println("Highest Temperature: " + highTemp);
        System.out.println("Lowest Temperature: " + lowTemp);
    }
}

