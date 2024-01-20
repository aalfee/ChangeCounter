import java.awt.*;
import javax.swing.*;

public class myGUI extends JFrame{
    public static myGUI initiateGUI(myGUI GUI) throws Exception{
        GUI = new myGUI();
        GUI.setSize(540,540);
        GUI.setLocation(300,300);
        GUI.setLayout(new GridLayout(3,1));
        GUI.setTitle("Change Counter");
        GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container myContentPane = GUI.getContentPane();
        JPanel panel = new JPanel();
        TextArea textArea = new TextArea();
        JTextField textField = new JTextField(3);
        JButton button = new JButton("Count change");
        JButton printButton = new JButton("Save to ledger.txt");
        // Set default dont for textArea
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        myContentPane.add(panel);
        myContentPane.add(textArea);
        myContentPane.add(printButton);
        panel.add(textField);
        panel.add(button);
        
        ButtonClickListener bcl = new ButtonClickListener(textField, textArea);
        button.addActionListener(bcl);

        PrintClickListener pcl = new PrintClickListener(textArea);
        printButton.addActionListener(pcl);

        GUI.setVisible(true);
        return GUI;
    }



}