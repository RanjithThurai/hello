import java.util.Scanner;
import java.text.DecimalFormat;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            sc.close();
            return;        }
        double n = sc.nextDouble();
        double sq = n * n;
        DecimalFormat df = new DecimalFormat("#.##########");
        System.out.println("square: " + df.format(sq));
        sc.close();
    } 
}
