package Exercise3;

import javax.swing.*;
import java.awt.*;

public class CarView extends JFrame {

    private TextField textName;
    private TextField textSpeed;
    private TextField textDisplacement;
    private JButton buttonName;
    private JButton buttonSpeed;
    private JButton buttonDisplacement;

    private JButton buttonShow;
    CarView(){
        setSize(450, 190);
        setLayout(null);
        setTitle("Your car");
        JLabel spaceShipName = new JLabel("Enter name: ");
        JLabel speed = new JLabel("Enter speed: ");
        JLabel spaceDisplacement = new JLabel("Enter price:");
        spaceShipName.setBounds(20, 20, 120, 20);
        speed.setBounds(20, 50, 150, 20);
        spaceDisplacement.setBounds(20, 80, 160, 20);
        setTextName(new TextField());
        setTextSpeed(new TextField());
        setTextDisplacement(new TextField());
        getTextName().setBounds(180, 20, 100, 20);
        getTextSpeed().setBounds(180, 50, 100, 20);
        getTextDisplacement().setBounds(180, 80, 100, 20);
        setButtonName(new JButton("Save"));
        setButtonSpeed(new JButton("Save"));
        setButtonDisplacement(new JButton("Save"));
        setButtonShow(new JButton("Show car's parameters"));
        getButtonName().setBounds(300, 18, 100, 24);
        getButtonSpeed().setBounds(300, 48, 100, 24);
        getButtonDisplacement().setBounds(300, 78, 100, 24);
        getButtonShow().setBounds(100, 110, 250, 30);
        setLocationRelativeTo(null);
        add(spaceShipName);
        add(speed);
        add(spaceDisplacement);
        add(getTextName());
        add(getTextSpeed());
        add(getTextDisplacement());
        add(getButtonName());
        add(getButtonSpeed());
        add(getButtonDisplacement());
        add(getButtonShow());
        setVisible(true);
    }

    public TextField getTextName() {
        return textName;
    }

    public void setTextName(TextField textName) {
        this.textName = textName;
    }

    public TextField getTextSpeed() {
        return textSpeed;
    }

    public void setTextSpeed(TextField textSpeed) {
        this.textSpeed = textSpeed;
    }

    public TextField getTextDisplacement() {
        return textDisplacement;
    }

    public void setTextDisplacement(TextField textDisplacement) {
        this.textDisplacement = textDisplacement;
    }

    public JButton getButtonName() {
        return buttonName;
    }

    public void setButtonName(JButton buttonName) {
        this.buttonName = buttonName;
    }

    public JButton getButtonSpeed() {
        return buttonSpeed;
    }

    public void setButtonSpeed(JButton buttonSpeed) {
        this.buttonSpeed = buttonSpeed;
    }

    public JButton getButtonDisplacement() {
        return buttonDisplacement;
    }

    public void setButtonDisplacement(JButton buttonDisplacement) {
        this.buttonDisplacement = buttonDisplacement;
    }

    public JButton getButtonShow() {
        return buttonShow;
    }

    public void setButtonShow(JButton buttonShow){
        this.buttonShow = buttonShow;
    }
}
