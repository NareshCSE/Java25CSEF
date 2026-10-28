package oopj_05aa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

public class Factorial extends JFrame implements ActionListener {
    JTextField input, result;
    JButton compute;

    Factorial() {
        setTitle("Factorial Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Enter an integer:"));
        input = new JTextField();
        add(input);

        add(new JLabel("Factorial:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        compute = new JButton("Compute");
        compute.addActionListener(this);
        add(compute);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(input.getText());

            if (n < 0 || n > 1000) {
                result.setText("Enter 0 to 1000");
                return;
            }

            BigInteger fact = BigInteger.ONE;

            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            result.setText(fact.toString());

        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Factorial();
    }
}