package KpOP;

import java.util.Locale;
import java.util.Scanner;

class main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        String result = getResult(x,y);
        System.out.println(result);

    }

    private static String getResult(double x,double y) {
        double eps = 1e-5;
        if(y-x>eps&&y>=x*x+y*y-1){
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