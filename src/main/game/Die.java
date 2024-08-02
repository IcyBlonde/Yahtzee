package game;
import java.util.ArrayList;

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
}
