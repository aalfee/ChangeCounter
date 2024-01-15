
import javax.swing.*;
import java.io.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PrintClickListener implements ActionListener {
    private static TextArea textArea1;

    public PrintClickListener(TextArea textArea) throws Exception {
        textArea1 = textArea;

    }
    public void actionPerformed(ActionEvent e) {
        try {
            PrintLedger pl = new PrintLedger(textArea1);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
