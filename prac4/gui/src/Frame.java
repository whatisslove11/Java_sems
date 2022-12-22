import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    private JFrame matchwindow;
    public Frame(){
        matchwindow = new JFrame("Footbal Table");
        matchwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        matchwindow.setResizable(false);
        matchwindow.setVisible(true);
        matchwindow.setBounds(0, 0, 300, 400);
        matchwindow.add(new Button());
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}