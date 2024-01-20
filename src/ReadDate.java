import java.awt.TextArea;
import java.io.*;
import java.util.Date;

public class ReadDate {
  private static String date1;
  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("date.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Date date = (Date) ois.readObject();
    date1 = date.toString();
    System.out.println("The date is: "+date);
    ois.close();
    fis.close();
  }
  public static void printDate(TextArea textArea){
    textArea.append("~~~~~~~~~~");
    textArea.append(date1);
    textArea.append("~~~~~~~~~~\n");
  }
}
