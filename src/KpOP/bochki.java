package KpOP;
import java.util.Scanner;
public class bochki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (0 > n | n > 1000)
            System.out.println("error");
       else if (n % 10 == 1|n%100==1 )
            System.out.println(n +" "+"bochka");
        else if (n % 10 >= 5 | n % 10 == 0 | n % 100 == 11|n%100==12|n%100==13|n%100==14)
            System.out.println(n +" "+ "bochek");
        else  if (n%10==2|n%10==3|n%10==4)
            System.out.println(n+" "+"bochki");
       }
      }
