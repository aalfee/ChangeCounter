
import java.io.*;

public class SaveMoney {
  public static int monies;
  static myGUI GUI;
  public static void main(String argv[]) throws Exception {
  
    FileOutputStream fos = new FileOutputStream("money.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Money money = new Money(monies);
    oos.writeObject(money);

    Bill bill = new Bill(monies/100);
    oos.writeObject(bill);

    Quarter q1 = new Quarter((monies%100)/25);
    oos.writeObject(q1);

    Dime dime = new Dime((monies%25)/10);
    oos.writeObject(dime);

    Nickel nickel = new Nickel(((monies%25)%10)/5);
    oos.writeObject(nickel);

    Coin coins = new Coin(((monies%25)%10)%5);
    oos.writeObject(coins);

    oos.flush();
    oos.close();
    fos.close();
  }
  public static void processInput(String input){
    monies = Integer.parseInt(input);
  }
}
