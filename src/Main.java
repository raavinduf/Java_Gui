import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("I'm a JLabel", JLabel.CENTER);
        JPanel panel = new JPanel();

        // Setting for the panel
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(45, 70, 45, 70)));

        // Define new buttons
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");

        // Add buttons to the frame (and spaces between buttons)
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        // Add the label and panel to the frame
        frame.setLayout(new GridLayout(2, 1));
        frame.add(label);
        frame.add(panel);

        // Settings for the frame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
