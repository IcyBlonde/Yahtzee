package client;

import java.util.ArrayList;
import java.util.Scanner;
import game.*;

public class Demo {
    public static void main(String[] args){
        ArrayList<Die> current = new ArrayList<>();
        Die.fill(current);
        Die.rollDie(current);
        Die.redo(current);
        Die.readDie(current);
    }
}
