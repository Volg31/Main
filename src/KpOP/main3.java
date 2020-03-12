package KpOP;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        double x, y;
        int z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.next().charAt(0);
        switch (z) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            default:
        }
    }
}