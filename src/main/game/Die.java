package game;

import java.util.ArrayList;
import java.util.Scanner;
import org.antlr.v4.runtime.InputMismatchException;

public class Die {
    public int value;

    public Die(){
        value = -1;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int number){
        this.value = number;
    }

    public static ArrayList<Die> rollDie(ArrayList<Die> die){
        for (Die element : die) {
            element.setValue((int) (Math.random() * 6) + 1);
        }
        return die;
    }

    public static ArrayList<Die> fill(ArrayList<Die> die){
        int curSize = die.size();
        while (curSize < 5) {
            die.add(new Die());
            curSize ++;
        }
        return die;
    }

    public static void readDie(ArrayList<Die> die){
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.println("Die " + (i + 1) + ":" + 
            " " + die.get(i).getValue());
        }
        System.out.println();
    }

    public static int[] toArray(ArrayList<Die> die){
        int[] dice = new int[4];
        for(int i = 0; i < 5; i++){
            dice[i] = die.get(i).getValue();
        }
        return dice;
    }

    public static void redo(ArrayList<Die> die){
    Scanner scanny = new Scanner(System.in);
    ArrayList<Die> reroll = new ArrayList<>();
    ArrayList<Integer> used = new ArrayList<>();

    int input = -1;
    do {
        try {
            System.out.println("\nPlease enter the number of the die you would like to reroll (1-5).");
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
    }

    public static int getTotal(ArrayList<Die> die){
        int total = 0;
        for (Die dice : die) {
            total += dice.getValue();
        }
        return total;
    }
}
