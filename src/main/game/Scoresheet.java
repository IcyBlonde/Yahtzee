package game;

import java.util.HashMap;
import java.util.Map;

public class Scoresheet {
    private static Map<String, Integer> scores;

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

    public static boolean used(String key){
        if(scores.get(key) == null){
            return false;
        } else {
            return true;
        }
    }
}
