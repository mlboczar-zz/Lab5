//Megan Boczar April 13, 2017
//FIX -- add options for crits

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();                                        //Declaring scanner and variables
        char roll = 'r';
        char rollAgain = 'y';
        int numSides = 0;
        System.out.println("Welcome to the Grand Circus Dice Roller.");

        do {
            if (roll == 'r') {                                          //Setting the number of sides on each dice
                System.out.println("How many sides should each die have?");
                numSides = scan.nextInt();
                System.out.println("You are rolling two " + numSides + "-sided dice. Press r to roll the dice.");
            }
            roll = scan.next().charAt(0);                               //Setting the scanner to accept a char
            if (roll == 'r') {                                          //Verifying the user pushes r to roll
                int diceRoll = random(numSides, r);                     //Calling random method using numSides and random variable
                int diceRoll2 = random(numSides, r);
                System.out.println("You have rolled the following numbers: " + diceRoll + ", " + diceRoll2);
                System.out.println("Do you want to roll again? (y/n)");                             // Asking user to roll again
                rollAgain = scan.next().charAt(0);
            }
            else {
                System.out.println("That is not how you roll! Press r to make your roll!");         //Verifying the user pushes r to roll
            }
        } while (rollAgain == 'y');                                      //Restart do loop if user does want to continue

        System.out.println("Thanks for rolling! Bye!");
    }

    public static int random(int numSides, Random r) {                    //Declaring a method called random
        return r.nextInt(numSides) + 1;
    }
}
