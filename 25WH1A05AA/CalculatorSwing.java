package oopj_05aa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {
    JTextField display;
    double num1 = 0, num2 = 0;
    String op = "";
    boolean startNewNumber = true;

    CalculatorSwing() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        try {
            if (s.matches("[0-9]")) {
                if (startNewNumber || display.getText().equals("0")) {
                    display.setText(s);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + s);
                }
            } else if (s.equals("C")) {
                display.setText("0");
                op = "";
                num1 = 0;
                num2 = 0;
                startNewNumber = true;
            } else if (s.equals("=")) {
                if (!op.isEmpty()) {
                    num2 = Double.parseDouble(display.getText());
                    calculate();
                    display.setText(formatResult(num1));
                    op = "";
                    startNewNumber = true;
                }
            } else {
                if (!op.isEmpty() && !startNewNumber) {
                    num2 = Double.parseDouble(display.getText());
                    calculate();
                    display.setText(formatResult(num1));
                } else {
                    num1 = Double.parseDouble(display.getText());
                }
                op = s;
                startNewNumber = true;
            }
        } catch (ArithmeticException ex) {
            display.setText("Cannot divide by zero");
            resetState();
        } catch (NumberFormatException ex) {
            display.setText("Error");
            resetState();
        }
    }

    private void calculate() {
        switch (op) {
            case "+": num1 += num2; break;
            case "-": num1 -= num2; break;
            case "*": num1 *= num2; break;
            case "/":
                if (num2 == 0) throw new ArithmeticException();
                num1 /= num2;
                break;
        }
    }

    private String formatResult(double d) {
        if (d == (long) d) {
            return String.format("%d", (long) d);
        } else {
            return String.valueOf(d);
        }
    }

    private void resetState() {
        op = "";
        num1 = 0;
        num2 = 0;
        startNewNumber = true;
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }
}
