import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxCalculator extends JFrame {
    private JTextField text;

    private String RPN;

    int opers = 0;
    int nums = 0;

    int oops = 0;

    MaxCalculator(){
        setTitle("Практическая работа 15, часть 3");
        setSize(400, 300);
        setLayout(null);
        text = new JTextField();
        text.setBounds(20, 50, 340, 20);
        JButton[] buttons = new JButton[16];
        JLabel label = new JLabel("Калькулятор");
        label.setBounds(150, 20, 150, 20);
        buttons[0] = new JButton("7");
        buttons[1] = new JButton("8");
        buttons[2] = new JButton("9");
        buttons[3] = new JButton("/");
        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("*");
        buttons[8] = new JButton("1");
        buttons[9] = new JButton("2");
        buttons[10] = new JButton("3");
        buttons[11] = new JButton("-");
        buttons[12] = new JButton("0");
        buttons[13] = new JButton(".");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("+");
        for (JButton el: buttons){
            el.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!Objects.equals(el.getText(), "=")){
                        if (!Objects.equals(el.getText(), "+") && !Objects.equals(el.getText(), "-") && !Objects.equals(el.getText(), "*") && !Objects.equals(el.getText(), "/"))
                            text.setText(text.getText() + el.getText());
                        else text.setText(text.getText() + " " + el.getText() + " ");
                    }
                    else {
                        String [] parse = text.getText().split(" ");
                        if(oops == 1){
                            System.out.println("FUUUUCK");
                            text.setText("Number format exception");
                        }else{
                            //System.out.println("oops is" + oops);
                            //System.out.println("FUUUUCK");
                            text.setText(String.valueOf(evalRPN(RPN(parse))));
                        }


                    }
                }
            });
        }
        for (int i = 0; i < 16; ++i){
            buttons[i].setBounds(40 + (i % 4) * 75, 90 + i / 4 * 40, 60, 30);
            add(buttons[i]);
        }
        add(label);
        add(text);
        setVisible(true);
    }

    public boolean isNumeric(String str) {
        try {
            //System.out.println("number is: " + str);
            Pattern p  = Pattern.compile("(^[+-]?([0-9]*[.])?($|[0-9]+)$)");
            Matcher m = p.matcher(str);
            ArrayList<String> ans = new ArrayList<>();
            while (m.find()){
                ans.add(m.group());
            }

            //System.out.println(ans);
            int opr = 0, nums = 0;
            if(ans.size()!=0){
                //System.out.println("ans is: " + ans);
                Double.parseDouble(str);

            }else{
                System.out.println("Number format exception");
                System.exit(1);
                //oops = 1;
            }


            //System.out.println("opers is: " + opr);
            //System.out.println("nums is: " + nums);

            return true;
        } catch(NumberFormatException e){

            //if(!str.equals("+") || !str.equals("*") || !str.equals("/") || !str.equals("-"))
            //System.out.println("not number or operation: " + str);
            return false;
        }
    }

    public int getPriority(String el){
        if (Objects.equals(el, "+") || Objects.equals(el, "-"))
            return 1;
        else return 2;
    }
    public String[] RPN(String [] tokens){
        String rpn = "";
        Stack<String> stack = new Stack<>();
        for (String el :tokens){
            if (isNumeric(el))
                rpn += el + " ";
            else{
                if (!stack.isEmpty() && getPriority(el) <= getPriority(stack.peek())) {
                    rpn += stack.pop() + " ";
                }
                stack.push(el);
            }
        }
        while (!stack.isEmpty()) {
            rpn += stack.pop() + " ";
        }
        return rpn.split(" ");
    }

    public double evalRPN(String[] tokens) {
        double a, b;

        Stack<Double> S = new Stack<Double>();
        for (String s : tokens) {
            opers+=1;
            if(s.equals("+")) {
                S.add(S.pop()+S.pop());
            }
            else if(s.equals("/")) {
                b = S.pop();
                a = S.pop();
                S.add(a / b);
            }
            else if(s.equals("*")) {
                S.add(S.pop() * S.pop());
            }
            else if(s.equals("-")) {
                b = S.pop();
                a = S.pop();
                S.add(a - b);
            }
            else {
                S.add(Double.parseDouble(s));
            }
        }
        //System.out.println("number of opers is: " + opers);
        return S.pop();
    }

    public static void main(String [] args){
        new MaxCalculator();
    }
}
