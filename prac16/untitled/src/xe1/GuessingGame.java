package xe1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGame extends JFrame {
    private int countChoice = 3;
    GuessingGame(){
        Random rand = new Random();
        int ansNumber = rand.nextInt(21);
        setSize(300, 200);
        setLayout(new BorderLayout());
        JLabel labelText = new JLabel("Введите число: ");
        JLabel labelDown = new JLabel("Нижняя граница программы", SwingConstants.CENTER);
        JLabel labelTitle = new JLabel("Practice 16", SwingConstants.CENTER);
        JTextArea text = new JTextArea();
        JButton button = new JButton("Проверить число");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (countChoice > 0){
                    if (Integer.parseInt(text.getText()) > ansNumber)
                        JOptionPane.showMessageDialog(null, "Вы не угадали. Загаданное число меньше","Диалоговое окно" , JOptionPane.WARNING_MESSAGE);
                    else if (Integer.parseInt(text.getText()) < ansNumber)
                        JOptionPane.showMessageDialog(null, "Вы не угадали. Загаданное число больше","Диалоговое окно" , JOptionPane.WARNING_MESSAGE);
                    else JOptionPane.showMessageDialog(null, "Вы угадали число","Диалоговое окно" , JOptionPane.WARNING_MESSAGE);
                    countChoice--;
                }
                else JOptionPane.showMessageDialog(null, "Вы истратили все попытки. Загаданное числов: " + ansNumber,"Диалоговое окно" , JOptionPane.WARNING_MESSAGE);
            }
        });

        add(labelTitle, BorderLayout.NORTH);
        add(labelText, BorderLayout.WEST);
        add(text, BorderLayout.CENTER);
        add(button, BorderLayout.EAST);
        add(labelDown, BorderLayout.SOUTH);
        setVisible(true);
    }


    public static void main(String [] args){
        new GuessingGame();
    }
}

