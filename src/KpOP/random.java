package KpOP;

public class random {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 282);
        if (x >= 141)
            System.out.println(x);
        else {
            System.out.println("До сложения="+x);
            x += 10;
            System.out.println("После="+x);
        }
        {
            if (x % 10 == 2)
                System.out.println("Тебе повезло");
        }


            }
        }




