import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class ums {
    public static void main(String[] args){
        JFrame frame=new JFrame("UMS");
        JPanel panel=new JPanel();
        JLabel label1=new JLabel("hi this is universtiy login page");

        BoxLayout boxlayout=new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(45,70,45,70)));

        JButton login=new JButton("Login");
        JRadioButton male=new JRadioButton("Male",true);

        panel.add(label1);
        panel.add(login);
        panel.add(male);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
