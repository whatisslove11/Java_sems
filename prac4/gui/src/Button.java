import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JPanel {
    private int Milan=0, Madrid=0;
    private JButton button, button2, button1;
    private JLabel jLabel, jLabel1, jLabel2;
    public Button() {
        //Надпись с результатами
        jLabel = new JLabel("Result: 0 X 0");
        setLayout(null);
        jLabel.setBounds(100,20,70,10);
        jLabel.setVisible(true);
        add(jLabel);

        //Кто последний забил
        jLabel1 = new JLabel("Last Scorer: N/A");
        jLabel1.setBounds(160,50,120,10);
        jLabel1.setVisible(true);
        add(jLabel1);

        jLabel2 = new JLabel("Winner: DRAW");
        jLabel2.setBounds(20,50,100,10);
        jLabel2.setVisible(true);
        add(jLabel2);

        //Свойства первой кнопки
        button = new JButton("Милан");
        button.setBounds(20,100,100,50);
        button.setVisible(true);
        add(button);
        //Вывод результата матча
        button2 = new JButton("Завершить матч");
        button2.setBounds(40,200,180,50);
        button2.setVisible(true);
        add(button2);

        //Свойства второй кнопки
        button1 = new JButton("Мадрид");
        button1.setBounds(170,100,100,50);
        button1.setVisible(true);
        add(button1);

        pushMadrid();
        pushMilan();
        pushENDING_GAME();
    }
    void pushMilan(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                jLabel1.setText("Last Scorer: Milan");
                jLabel.setText("Result: "+Integer.toString(Milan)+" X "+Integer.toString(Madrid));
            }
        });
    }
    void pushMadrid(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                jLabel1.setText("Last Scorer: Madrid");
                jLabel.setText("Result: "+Integer.toString(Milan)+" X "+Integer.toString(Madrid));

            }
        });
    }
    void pushENDING_GAME(){
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Madrid>Milan) jLabel2.setText("Winner: Madrid");
                else if (Madrid<Milan) jLabel2.setText("Winner: Milan");
                else jLabel2.setText("Winner: DRAW");
            }
        });
    }
}