package game;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Round {
    public static ArrayList<String> players = new ArrayList<>();
    public static Map<String, Scoresheet> sheets = new HashMap<>();

    public static void setNames(ArrayList<String> players){
        Scanner scanny = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Enter player name or 'n' to stop\n");
            input = scanny.nextLine();
            players.add(input);
        } while (input != "n");
    }

    public static void makeSheets(ArrayList<String> players, Map<String, Scoresheet> sheets){
        for(int i = 0; i < players.size(); i++){
            sheets.put("sheet" + (i +1), new Scoresheet(players.get(i)));
        }
    }
}
