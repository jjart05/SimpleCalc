import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        frame.setLayout(new GridLayout(5, 2));
        frame.add(new JLabel("Number 1:")); frame.add(num1);
        frame.add(new JLabel("Number 2:")); frame.add(num2);
        frame.add(add); frame.add(subtract);
        frame.add(multiply); frame.add(divide);
        frame.add(new JLabel("Result:")); frame.add(result);

        add.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a + b));
            } catch (Exception ex) {
                result.setText("Error");
            }
        });

        subtract.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a - b));
            } catch (Exception ex) {
                result.setText("Error");
            }
        });

        multiply.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a * b));
            } catch (Exception ex) {
                result.setText("Error");
            }
        });

        divide.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                if (b == 0) throw new ArithmeticException();
                result.setText(String.valueOf(a / b));
            } catch (Exception ex) {
                result.setText("Error");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
