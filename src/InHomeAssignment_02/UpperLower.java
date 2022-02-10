package InHomeAssignment_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperLower extends JFrame {
    JButton toggle;
    JTextField textField;

    UpperLower() {
        super("Text Converter");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("text box : "));
        add(textField = new JTextField(20));
        add(toggle = new JButton("toggle"));

        toggle.addActionListener(new Inner());
        setVisible(true);
    }

    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource() == toggle)
            {
                String text = textField.getText();
                String check = text.toUpperCase(); //converting (any) string to upper case

                if(text.equals(check)) {  //checking if it matches with upper case
//                    textField.setText(text.toLowerCase());   // to print inside the text field
                    System.out.println(text.toLowerCase());
                }

                else {
//                    textField.setText(text.toUpperCase());  //to print inside the text field
                    System.out.println(text.toUpperCase());

                }
            }
        }
    }

    public static void main(String[] args)
    {
        new UpperLower();
    }
}

