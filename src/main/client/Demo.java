package client;

import java.util.ArrayList;
import javax.swing.*;
import game.*;

public class Demo {

    public static JFrame Yahtzee; 
    public static JLabel intro;
    public static JTextField name;
    public static JPanel playerSelect;
    public static JButton next;
    public static JButton done;
    public static void main(String[] args){
        Yahtzee = new JFrame();
        Yahtzee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Yahtzee.setSize(300, 150);
        playerSelect = new JPanel();
        Yahtzee.add(playerSelect);
        intro = new JLabel("Input Player Name Then Done");
        playerSelect.add(intro);
        name = new JTextField(20);
        playerSelect.add(name);
        next = new JButton("Next Player");
        done = new JButton("Done");
        playerSelect.add(next);
        playerSelect.add(done);
        Yahtzee.setVisible(true);
    }
}
