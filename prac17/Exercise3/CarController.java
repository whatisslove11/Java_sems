package Exercise3;

import javax.swing.*;

public class CarController {
    private Car model;
    private CarView view;

    CarController(Car model, CarView view){
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView(){
        view.getTextName().setText(model.getName());
        view.getTextSpeed().setText(String.valueOf(model.getSpeed()));
        view.getTextDisplacement().setText(String.valueOf(model.getSpaceDisplacement()));
    }

    public void initController(){
        view.getButtonName().addActionListener(e -> setStarShipName());
        view.getButtonSpeed().addActionListener(e -> setStarShipSpeed());
        view.getButtonDisplacement().addActionListener(e -> setStarShipSpaceDisplacement());
        view.getButtonShow().addActionListener(e -> printDetails());
    }

    public void setStarShipName(){
        model.setName(view.getTextName().getText());
        JOptionPane.showMessageDialog(null, "Name saved",
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    public void setStarShipSpeed(){
        model.setSpeed(Integer.parseInt(view.getTextSpeed().getText()));
        JOptionPane.showMessageDialog(null, "Speed saved",
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    public void setStarShipSpaceDisplacement(){
        model.setSpaceDisplacement(Integer.parseInt(view.getTextDisplacement().getText()));
        JOptionPane.showMessageDialog(null, "Price saved",
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void printDetails(){
        JOptionPane.showMessageDialog(null,
                "Ship: " + model.getName() + ", Speed: " + model.getSpeed() + ", Price: " + model.getSpaceDisplacement(),
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
