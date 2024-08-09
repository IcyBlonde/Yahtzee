package game;

import java.util.HashMap;
import java.util.Map;

public class Scoresheet {
    private static Map<String, Integer> scores;

    public Scoresheet(String name) {
        scores = new HashMap<>();
        scores.put(name, 0);
        scores.put("1s", null);
        scores.put("2s", null);
        scores.put("3s", null);
        scores.put("4s", null);
        scores.put("5s", null);
        scores.put("6s", null);
        scores.put("3 of a kind", null);
        scores.put("4 of a kind", null);
        scores.put("Full house", null);
        scores.put("Small straight", null);
        scores.put("Large straight", null);
        scores.put("Yahtzee", null);
        scores.put("Chance", null);
    }

    public static boolean updateScore(String playerName, String category, int points) {
        if (scores.containsKey(playerName)) {
            try {
                if (scores.get(category) != null) {
                   scores.put(category, points); 
                   return true;
                }
            } catch (Exception e) {
                System.out.println("Invalid Category");
                return false;
            } 
        } else {
            System.out.println("Player not found.");
            return false;
        }
        return false;
    }
}
