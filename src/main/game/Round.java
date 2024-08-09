package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Round {
    public static ArrayList<String> players = new ArrayList<>();
    public static ArrayList<Scoresheet> sheets = new ArrayList<>();

    public static void setNames(ArrayList<String> players){
        Scanner scanny = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Enter player name or 'n' to stop\n");
            input = scanny.nextLine();
            players.add(input);
        } while (input != "n");
    }

    public static void makeSheets(ArrayList<String> players, ArrayList<Scoresheet> sheets){
        for (String player : players) {
            sheets.add(new Scoresheet(player));
        }
    }
}
