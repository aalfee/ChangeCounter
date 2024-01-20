import java.awt.TextArea;
import java.io.*;

public class PrintLedger{
public PrintLedger(TextArea textArea) throws Exception {
    FileOutputStream fos = new FileOutputStream("ledger.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(textArea);
    oos.flush();
    oos.close();
    fos.close();
}
}