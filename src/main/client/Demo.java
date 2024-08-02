package client;

import java.util.ArrayList;
import java.util.Scanner;
import game.Die;

public class Demo {
    public static void main(String[] args){
        ArrayList<Die> current = new ArrayList<>();
        Die.fill(current);
        Die.rollDie(current);
        for(int i = 0; i < 3; i++){
            Die.readDie(current);
            current = redo(current);
        }
    }

    public static ArrayList<Die> redo(ArrayList<Die> die){
        Scanner scanny = new Scanner(System.in);
        ArrayList<Die> reroll = new ArrayList<>();
        System.out.println("Please enter the number of the die you would like to reroll");
        System.out.println("Enter 0 to quit.");
        int input = scanny.nextInt();
        while(input < 0 && input > 5){
            System.out.println("Please enter a valid  number.");
            input = scanny.nextInt();
        }
        while(input != 0){
            reroll.add(die.get(input - 1));
            die.remove(input -1);

            System.out.println("Please enter the number of the die you would like to reroll");
            System.out.println("Enter 0 to quit.");
            input = scanny.nextInt();
        }
        Die.rollDie(reroll);
        for (Die element : reroll) {
            die.add(element);
        }
        return die;
    }
}
