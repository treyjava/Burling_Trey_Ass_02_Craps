import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        Random newRnd = new Random();

        boolean done = false;
        String anotherYN = "";
        String choiceYN = "";
        String trash = "";
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = 0;

        do
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die1 + die2;
            // Initial roll
            System.out.println("Your first roll is " + crapsRoll + ". ");
            // If the user rolls a winning number
            if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("Since you rolled " + crapsRoll + ", you crapped out, losing the game! ");
            }
            // If the user rolls a losing number
            else if(crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Since you rolled " + crapsRoll + ", you have gotten a natural, winning the game! ");
            }
            // If the user rolls a neutral number
            else
            {
                int newRoll = 0;
                // Loop for making new rolls
                while(newRoll != crapsRoll && newRoll != 7)
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    newRoll = die1 + die2;
                    System.out.println("Your next roll is " + newRoll);
                }
                // If the user rolls the point sum
                if(newRoll == crapsRoll)
                {
                    System.out.println("You have rolled the point sum, you win! ");
                }
                // If the user rolls a 7
                else
                {
                    System.out.println("You have rolled a 7, you lost! ");
                }
            }

            System.out.print("Would you like to play again? [Y/N] ");
            anotherYN = in.nextLine();
            if(anotherYN.equalsIgnoreCase("N"))
            {
                done = true;
            }
        }while(!done);
    }
}