package game;

import java.util.HashMap;
import java.util.Map;

public class Scoresheet {
    private static Map<String, Integer> scores;
    private static Map<String, Integer> setValues;

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

        setValues.put("Full house", 25);
        setValues.put("Small straight", 30);
        setValues.put("Large straight",40);
        setValues.put("Yahtzee", 50);
    }

    public static boolean used(String key){
        if(scores.get(key) == null){
            return false;
        } else {
            return true;
        }
    }

    public static boolean setValue(String key){
        if (key == "Full house" || key == "Small straight" || key == "Large straight" || key == "Yahtzee") {
            return true;
        } else {
            return false;
        }
    }

    public static void updateCard(String key, int value){
        try {
            if (!used(key) && !setValue(key)) {
                scores.put(key, value);
            } else if (!used(key)) {
                scores.put(key, setValues.get(key));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid param");
        }

    }
}
