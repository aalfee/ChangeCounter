import java.awt.TextArea;
import java.io.*;


public class ReadMoney {
  private static String total;
  private static String bill1;
  private static String quarter1;
  private static String dime1;
  private static String nickel1;
  private static String coin1;
  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("quarter.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Money money = (Money) ois.readObject();
    System.out.println("The amount of money is: "+money);
    total = money.toString();
    Bill bill = (Bill) ois.readObject();
    System.out.println("The amount of change is: "+bill+" in bills");
    bill1 = bill.toString();
    Quarter quarter = (Quarter) ois.readObject();
    System.out.println("The amount of change is: "+quarter+"in quarters");
    quarter1 = quarter.toString();
    Dime dime = (Dime) ois.readObject();
    System.out.println("The amount of change is: "+dime+"in dimes");
    dime1 = dime.toString();
    Nickel nickel = (Nickel) ois.readObject();
    System.out.println("The amount of change is: "+nickel+"in nickels");
    nickel1 = nickel.toString();
    Coin coin = (Coin) ois.readObject();
    System.out.println("The amount of change is: "+coin+" in cents");
    coin1 = coin.toString();
    ois.close();
    fis.close();
  }
  public static void processOutput(TextArea textArea){
    textArea.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
    textArea.append("The amount of money is: "+total+"\n");
    textArea.append("The amount of change is: \n"+bill1+" in bills \n");
    textArea.append(quarter1+"in quarters \n");
    textArea.append(dime1+"in dimes \n");
    textArea.append(nickel1+"in nickels \n");
    textArea.append(coin1+" in cents \n");
  }
}
