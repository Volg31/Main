package KpOP;

public class random {
    public static void main(String[] args) {
        int z = (int) (Math.random() * 282);
        if (z >= 141)
            System.out.println(z);
        else {
            System.out.println("До сложения="+z);
            z += 10;
            System.out.println("После="+z);
        }
        {
            if (z % 10 == 2)
                System.out.println("Тебе повезло");
        }


            }
        }




