package client;

import java.util.ArrayList;
import java.util.Scanner;
import game.Die;
import java.util.InputMismatchException;

public class Demo {
    public static void main(String[] args){
        ArrayList<Die> current = new ArrayList<>();
        Die.fill(current);
        Die.rollDie(current);
        for(int i = 0; i < 3; i++){
            Die.readDie(current);
            current = redo(current);
        }
        Die.readDie(current);
    }

    public static ArrayList<Die> redo(ArrayList<Die> die){
        Scanner scanny = new Scanner(System.in);
        ArrayList<Die> reroll = new ArrayList<>();
        ArrayList<Integer> used = new ArrayList<>();

        int input = -1;
        do {
            try {
                System.out.println("Please enter the number of the die you would like to reroll (1-5).");
                System.out.println("Enter 0 to quit.\n");
                input = scanny.nextInt();
    
                if (input >= 1 && input <= 5 && !used.contains(input)) {
                    used.add(input);
                    reroll.add(die.get(input - 1));
                    die.remove(input - 1);
                } else if (input != 0) {
                    System.out.println("Invalid input or die already selected. Please try again.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.\n");
                scanny.next(); // Clear the invalid input from the scanner
                input = -1; // Reset input to force retry
            }
        } while (input != 0);
        Die.rollDie(reroll);


        for (Die element : reroll) {
            die.add(element);
        }
        return die;
    }
}
