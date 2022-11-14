import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        boolean done = false;
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;

        do
        {
            System.out.print("Press any key to roll the die. ");
            crapsRoll = in.nextInt();
            while(crapsRoll >=1, crapsRoll <= 12)
            {

            }


        }while(!done);



    }
}