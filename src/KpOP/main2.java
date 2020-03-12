package KpOP;

import java.util.Locale;
import java.util.Scanner;

public class main2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        String result = getResult(x, y);
        System.out.println(result);

    }

    private static String getResult(double x, double y) {
        double eps = 1e-5;
        if(y>=x && y>=0 && y<=2-x*x){
            return "Yes";
        }
        else{
            return "No";
        }
    }

    private static double readDouble() {
        return scanner.nextDouble();

    }


}