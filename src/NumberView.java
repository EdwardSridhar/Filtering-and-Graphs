import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Numbers model;

    public NumberView(int n1, int n2, int n3, Numbers model) {

        // NumberView -> Model -> GraphView
        this.model = model;

        //label and textfield for red
        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(38);
        redNumber.setText(n1 + "");
        add(redNumber);

        //label and textfield for green
        add(new JLabel("Green"));
        JTextField greenNumber = new JTextField(38);
        greenNumber.setText(n2 + "");
        add(greenNumber);

        //label and textfield for blue
        add(new JLabel("Blue"));
        JTextField blueNumber = new JTextField(38);
        blueNumber.setText(n3 + "");
        add(blueNumber);

        //button for the submit
        JButton submit = new JButton("Submit");
        add(submit);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adds an action listener to the submit button
        submit.addActionListener(event -> {
            int number1 = Integer.parseInt(redNumber.getText());
            int number2 = Integer.parseInt(greenNumber.getText());
            int number3 = Integer.parseInt(blueNumber.getText());
            model.updateValues(number1, number2, number3);
        });
    }
}
