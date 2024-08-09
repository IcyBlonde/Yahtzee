package game;

import java.util.HashMap;
import java.util.Map;

public class Scoresheet {
    private Map<String, Integer> scores;

    public Scoresheet() {
        scores = new HashMap<>();
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

    public void addPlayer(String playerName) {
        scores.put(playerName, 0);
    }

    public void updateScore(String playerName, int points) {
        if (scores.containsKey(playerName)) {
            scores.put(playerName, scores.get(playerName) + points);
        } else {
            System.out.println("Player not found.");
        }
    }
}
