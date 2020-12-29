import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GUI implements ActionListener {

    private enum Actions{
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO, ADD, SUBTRACT, MULTIPLY, DIVIDE, SUBMIT, DECIMAL, NEGATIVE, CLEAR, POWER, BACK
    }
    
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JButton button5;
    private static JButton button6;
    private static JButton button7;
    private static JButton button8;
    private static JButton button9;
    private static JButton button0;
    private static JButton buttonMultiply;
    private static JButton buttonAdd;
    private static JButton buttonSubtract;
    private static JButton buttonDecimal;
    private static JButton buttonSubmit;
    private static JButton buttonNegative;
    private static JButton buttonClear;
    private static JButton buttonBack;
    private static JButton buttonPower;
    private static JButton buttonDivide;

    private static JTextField userText;
    private static JLabel answer;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        frame.setSize(315, 489);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("Calculator");
        
        panel.setLayout(null);
        
        //Text Box
        userText = new JTextField(20);
        userText.setBounds(20, 20, 175, 25);
        userText.setBackground(Color.WHITE);
        userText.setEditable(false);
        userText.setFont(new Font("Dialog", Font.PLAIN, 15));
        panel.add(userText);
      
        //Answer Label
        answer = new JLabel("", SwingConstants.RIGHT);
        answer.setBounds(200, 20, 90, 25);
        answer.setFont(new Font("Dialog", Font.BOLD, 15));
        panel.add(answer);
      
        //1
        button1 = new JButton("1");
        button1.setBounds(0, 300, 75, 75);
        button1.setActionCommand(Actions.ONE.name());
        button1.addActionListener(new GUI());
        button1.setFont(new Font("Dialog", Font.PLAIN, 20));
        button1.setBackground(Color.WHITE);
        panel.add(button1);
        
        //2
        button2 = new JButton("2");
        button2.setBounds(75, 300, 75, 75);
        button2.setActionCommand(Actions.TWO.name());
        button2.addActionListener(new GUI());
        button2.setFont(new Font("Dialog", Font.PLAIN, 20));
        button2.setBackground(Color.WHITE);
        panel.add(button2);
        
        //3
        button3 = new JButton("3");
        button3.setBounds(150, 300, 75, 75);
        button3.setActionCommand(Actions.THREE.name());
        button3.addActionListener(new GUI());
        button3.setFont(new Font("Dialog", Font.PLAIN, 20));
        button3.setBackground(Color.WHITE);
        panel.add(button3);
        
        //4
        button4 = new JButton("4");
        button4.setBounds(0, 225, 75, 75);
        button4.setActionCommand(Actions.FOUR.name());
        button4.addActionListener(new GUI());
        button4.setFont(new Font("Dialog", Font.PLAIN, 20));
        button4.setBackground(Color.WHITE);
        panel.add(button4);
        
        //5
        button5 = new JButton("5");
        button5.setBounds(75, 225, 75, 75);
        button5.setActionCommand(Actions.FIVE.name());
        button5.addActionListener(new GUI());
        button5.setFont(new Font("Dialog", Font.PLAIN, 20));
        button5.setBackground(Color.WHITE);
        panel.add(button5);
        
        //6
        button6 = new JButton("6");
        button6.setBounds(150, 225, 75, 75);
        button6.setActionCommand(Actions.SIX.name());
        button6.addActionListener(new GUI());
        button6.setFont(new Font("Dialog", Font.PLAIN, 20));
        button6.setBackground(Color.WHITE);
        panel.add(button6);
        
        //7
        button7 = new JButton("7");
        button7.setBounds(0, 150, 75, 75);
        button7.setActionCommand(Actions.SEVEN.name());
        button7.addActionListener(new GUI());
        button7.setFont(new Font("Dialog", Font.PLAIN, 20));
        button7.setBackground(Color.WHITE);
        panel.add(button7);
        
        //8
        button8 = new JButton("8");
        button8.setBounds(75, 150, 75, 75);
        button8.setActionCommand(Actions.EIGHT.name());
        button8.addActionListener(new GUI());
        button8.setFont(new Font("Dialog", Font.PLAIN, 20));
        button8.setBackground(Color.WHITE);
        panel.add(button8);
        
        //9
        button9 = new JButton("9");
        button9.setBounds(150, 150, 75, 75);
        button9.setActionCommand(Actions.NINE.name());
        button9.addActionListener(new GUI());
        button9.setFont(new Font("Dialog", Font.PLAIN, 20));
        button9.setBackground(Color.WHITE);
        panel.add(button9);
        
        //Clear
        buttonClear = new JButton("C");
        buttonClear.setBounds(0, 75, 75, 75);
        buttonClear.setActionCommand(Actions.CLEAR.name());
        buttonClear.addActionListener(new GUI());
        buttonClear.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonClear.setBackground(new Color(230,230,230));
        panel.add(buttonClear);
        
        //Back
        buttonBack = new JButton("<-");
        buttonBack.setBounds(75, 75, 75, 75);
        buttonBack.setActionCommand(Actions.BACK.name());
        buttonBack.addActionListener(new GUI());
        buttonBack.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonBack.setBackground(new Color(230,230,230));
        panel.add(buttonBack);
        
        //Power
        buttonPower = new JButton("^");
        buttonPower.setBounds(150, 75, 75, 75);
        buttonPower.setActionCommand(Actions.POWER.name());
        buttonPower.addActionListener(new GUI());
        buttonPower.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonPower.setBackground(new Color(230,230,230));
        panel.add(buttonPower);
      
        //Divide
        buttonDivide = new JButton("/");
        buttonDivide.setBounds(225, 75, 75, 75);
        buttonDivide.setActionCommand(Actions.DIVIDE.name());
        buttonDivide.addActionListener(new GUI());
        buttonDivide.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonDivide.setBackground(new Color(230,230,230));
        panel.add(buttonDivide);
        
        //0
        button0 = new JButton("0");
        button0.setBounds(75, 375, 75, 75);
        button0.setActionCommand(Actions.ZERO.name());
        button0.addActionListener(new GUI());
        button0.setFont(new Font("Dialog", Font.PLAIN, 20));
        button0.setBackground(Color.WHITE);
        panel.add(button0);
        
        //Negative
        buttonNegative = new JButton("+/-");
        buttonNegative.setBounds(0, 375, 75, 75);
        buttonNegative.setActionCommand(Actions.NEGATIVE.name());
        buttonNegative.addActionListener(new GUI());
        buttonNegative.setFont(new Font("Dialog", Font.PLAIN, 20));
        buttonNegative.setBackground(Color.WHITE);
        panel.add(buttonNegative);
        
        //Decimal
        buttonDecimal = new JButton(".");
        buttonDecimal.setBounds(150, 375, 75, 75);
        buttonDecimal.setActionCommand(Actions.DECIMAL.name());
        buttonDecimal.addActionListener(new GUI());
        buttonDecimal.setFont(new Font("Dialog", Font.PLAIN, 30));
        buttonDecimal.setBackground(Color.WHITE);
        panel.add(buttonDecimal);
        
        
        //Multiply
        buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(225, 150, 75, 75);
        buttonMultiply.setActionCommand(Actions.MULTIPLY.name());
        buttonMultiply.addActionListener(new GUI());
        buttonMultiply.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonMultiply.setBackground(new Color(230,230,230));
        panel.add(buttonMultiply);
        
        //Add
        buttonAdd = new JButton("+");
        buttonAdd.setBounds(225, 300, 75, 75);
        buttonAdd.setActionCommand(Actions.ADD.name());
        buttonAdd.addActionListener(new GUI());
        buttonAdd.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonAdd.setBackground(new Color(230,230,230));
        panel.add(buttonAdd);
        
        //Subtract
        buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(225, 225, 75, 75);
        buttonSubtract.setActionCommand(Actions.SUBTRACT.name());
        buttonSubtract.addActionListener(new GUI());
        buttonSubtract.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonSubtract.setBackground(new Color(230,230,230));
        panel.add(buttonSubtract);
        
        //Submit/Equals
        buttonSubmit = new JButton("=");
        buttonSubmit.setBounds(225, 375, 75, 75);
        buttonSubmit.setActionCommand(Actions.SUBMIT.name());
        buttonSubmit.addActionListener(new GUI());
        buttonSubmit.setFont(new Font("Dialog", Font.BOLD, 20));
        buttonSubmit.setBackground(new Color(125, 125, 125));
        buttonSubmit.setForeground(Color.WHITE);
        panel.add(buttonSubmit);
        
        frame.setVisible(true);
     
    }
    
    private void operationClicked(char op) {
        String temp = userText.getText();
        if(temp.length() >= 1 && temp.charAt(temp.length()-1) != '-') {
            char operation = temp.charAt(temp.length()-1);
            if(operation == ' ') {
                userText.setText(temp.substring(0, temp.length()-2) + op + " ");
            }
            else {
                userText.setText(userText.getText() + " " + op + " ");
            }       
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
       //userLabel.setText(userLabel.getText() + "1");
       if(evt.getActionCommand() == Actions.ONE.name()) {
           userText.setText(userText.getText() + "1");
       }
       else if(evt.getActionCommand() == Actions.TWO.name()) {
           userText.setText(userText.getText() + "2");
       }
       else if(evt.getActionCommand() == Actions.THREE.name()) {
           userText.setText(userText.getText() + "3");
       }
       else if(evt.getActionCommand() == Actions.FOUR.name()) {
           userText.setText(userText.getText() + "4");
       }
       else if(evt.getActionCommand() == Actions.FIVE.name()) {
           userText.setText(userText.getText() + "5");
       }
       else if(evt.getActionCommand() == Actions.SIX.name()) {
           userText.setText(userText.getText() + "6");
       }
       else if(evt.getActionCommand() == Actions.SEVEN.name()) {
           userText.setText(userText.getText() + "7");
       }
       else if(evt.getActionCommand() == Actions.EIGHT.name()) {
           userText.setText(userText.getText() + "8");
       }
       else if(evt.getActionCommand() == Actions.NINE.name()) {
           userText.setText(userText.getText() + "9");
       }
       else if(evt.getActionCommand() == Actions.ZERO.name()) {
           userText.setText(userText.getText() + "0");
       }
       
       //Negative
       else if(evt.getActionCommand() == Actions.NEGATIVE.name()) {
           String temp = userText.getText();
           boolean multipleTerms = false;
           int i = temp.length()-1;
           if(i >= 0) {
               while(i >= 0 && !multipleTerms) {
                   if(temp.charAt(i) == ' ') {
                       if(i == temp.length()-1) {
                           multipleTerms = true;
                       }
                       else if(temp.charAt(i+1) == '-') {
                           userText.setText(userText.getText().substring(0, i+1) + userText.getText().substring(i+2));
                           multipleTerms = true;
                       }
                       else {
                           userText.setText(userText.getText().substring(0, i+1) + '-' + userText.getText().substring(i+1));
                           multipleTerms = true;
                       }
                   }
                   i--;
               }
               if(!multipleTerms) {
                   if(temp.charAt(0) == '-') {
                       userText.setText(userText.getText().substring(1));
                   }
                   else {  
                       userText.setText('-' + userText.getText());
                   }
               }
           }
       }
       //Decimal
       else if(evt.getActionCommand() == Actions.DECIMAL.name()) {
           String text = userText.getText();
           boolean decimal = false;
           for(int i = text.length()-1; i > 0; i--) {
               if(text.charAt(i) == '.') {
                   decimal = true;
                   break;
               }
               else if(text.charAt(i) == ' ') {
                   break;
               }
           }
           if(!decimal) {
               userText.setText(text + '.');
           }
       }
       //Multiply
       else if(evt.getActionCommand() == Actions.MULTIPLY.name()) {
           operationClicked('*');
       }
       //Add
       else if(evt.getActionCommand() == Actions.ADD.name()) {
           operationClicked('+');
       }
       //Subtract
       else if(evt.getActionCommand() == Actions.SUBTRACT.name()) {
           operationClicked('-');
       }
       //Divide
       else if(evt.getActionCommand() == Actions.DIVIDE.name()) {
           operationClicked('/');
       }
       //Power
       else if(evt.getActionCommand() == Actions.POWER.name()) {
           operationClicked('^');
       }
       //Back
       else if(evt.getActionCommand() == Actions.BACK.name()) {
           String temp = userText.getText();
           if(temp.length() > 0) {
               if(temp.charAt(temp.length()-1) == ' ') {
                   userText.setText(temp.substring(0, temp.length()-3));
               }
               else {
                   temp = temp.substring(0, temp.length()-1);
                   userText.setText(temp);
               }
           }
       }
       //Clear
       else if(evt.getActionCommand() == Actions.CLEAR.name()) {
           userText.setText("");
           answer.setText("");
       }
       //Submit Equals
       else if(evt.getActionCommand() == Actions.SUBMIT.name()) {
           String text = userText.getText();   
           if(text.length() != 0) {
               char lastChar = text.charAt(text.length()-1);
               if(lastChar == ' ') {
                   text = text.substring(0, text.length()-3);
               }
               if(lastChar == '.') {
                   text = text.substring(0, text.length()-1);
               }
           text = text + " =";
           ArrayList<Double> values = new ArrayList<Double>();          
           ArrayList<String> operations = new ArrayList<String>();          
           
           int start = 0;
           for(int i = 0; i < text.length(); i++) {
               char currentChar = text.charAt(i);
               if(currentChar == ' ') {
                   values.add(Double.parseDouble(text.substring(start, i)));
                   if(text.charAt(i+1) != '=') {
                       operations.add(Character.toString(text.charAt(i+1)));
                   }
                   i += 2;
                   start = i+1;
               }
           }
           
           double result = values.get(0);
           for(int i = 1; i < values.size(); i++) {
               if(operations.get(i-1).contentEquals("+")) {
                   result = result + values.get(i);
               }
               else if(operations.get(i-1).contentEquals("-")) {
                   result = result - values.get(i);
               }
               else if(operations.get(i-1).contentEquals("*")) {
                   result = result * values.get(i);
               }
               else if(operations.get(i-1).contentEquals("/")) {
                   result = result / values.get(i);
               }
               else if(operations.get(i-1).contentEquals("^")) {
                   result = Math.pow(result, values.get(i));
               }
           }
           if(result > 9999999) {
               userText.setText(text.substring(0, text.length()-2));
               answer.setText(String.format("%6.3e", result));
           }
           else if(result == (int)result) {
               userText.setText(text.substring(0, text.length()-2));
               answer.setText(String.format("%d", (int)result));
           }
           else {
               userText.setText(text.substring(0, text.length()-2));
               answer.setText(String.format("%.3f",result));
           }
          }
       }
}
}