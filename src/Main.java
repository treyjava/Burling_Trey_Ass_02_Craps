import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        boolean done = false;
        boolean anotherYN = false;
        String choiceYN = "";
        String trash = "";
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;


        System.out.println("Your roll is " + crapsRoll + ". ");
        do
        {
            if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("Since you rolled a " + crapsRoll + ", you crapped out, losing the game! ");
                done = true;

            }
            else if(crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Since you rolled a " + crapsRoll + ", you have gotten a natural, winning the game! ");
                done = true;
            }
            else
            {
                System.out.println("Since you rolled a " + crapsRoll + ", you must keep rolling");

            }
        }while(!done);

    }
}