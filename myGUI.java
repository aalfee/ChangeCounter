import java.awt.*;
import javax.swing.*;

public class myGUI extends JFrame{
    public static myGUI initiateGUI(myGUI GUI){
        GUI = new myGUI();
        GUI.setSize(540,450);
        GUI.setLocation(300,300);
        GUI.setLayout(new GridLayout(2,1));
        GUI.setTitle("Change Counter");
        GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container myContentPane = GUI.getContentPane();
        JPanel panel = new JPanel();
        TextArea textArea = new TextArea();
        JTextField textField = new JTextField(3);
        JButton button = new JButton("Count change");
        // Set default dont for textArea
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        myContentPane.add(panel);
        myContentPane.add(textArea);
        panel.add(textField);
        panel.add(button);
        ButtonClickListener bcl = new ButtonClickListener(textField, textArea);
        button.addActionListener(bcl);

        GUI.setVisible(true);
        return GUI;
    }



}