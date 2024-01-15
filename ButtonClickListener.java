import javax.swing.*;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonClickListener implements ActionListener {
    private JTextField textField;
    private TextArea textArea1;

    public ButtonClickListener(JTextField textField, TextArea textArea) {
        this.textField = textField;
        textArea1 = textArea;
        textArea1.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void actionPerformed(ActionEvent e) {
    
        // Get input from the JTextField
        String userInput = textField.getText();
        
        // Call method from SaveMoney class to process input
        SaveMoney.processInput(userInput);

            try {
                SaveMoney.main(null);
                ReadMoney.main(null);
                ReadMoney.processOutput(textArea1);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        
        

        
        
    }
}