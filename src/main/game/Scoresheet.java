package game;

import java.util.HashMap;
import java.util.Map;

public class Scoresheet {
    private Map<String, Integer> scores;
    private Map<String, Integer> setValues;

    public Scoresheet() {
        scores = new HashMap<>();
        setValues = new HashMap<>();
        scores.put("1s", -1);
        scores.put("2s", -1);
        scores.put("3s", -1);
        scores.put("4s", -1);
        scores.put("5s", -1);
        scores.put("6s", -1);
        scores.put("3 of a kind", -1);
        scores.put("4 of a kind", -1);
        scores.put("Full house", -1);
        scores.put("Small straight", -1);
        scores.put("Large straight", -1);
        scores.put("Yahtzee", -1);
        scores.put("Chance", -1);

        setValues.put("Full house", 25);
        setValues.put("Small straight", 30);
        setValues.put("Large straight",40);
        setValues.put("Yahtzee", 50);
    }

    public boolean used(String key){
        return scores.get(key) != -1;
    }

    public boolean setValue(String key){
        return setValues.containsKey(key);
    }

    public void updateCard(String key, int value){
        if (!scores.containsKey(key)) {
            System.out.println("Invalid key: " + key);
            return;
        }

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
