import java.io.*;

public class Money implements Serializable {
    private static final long serialVersionUID = 1054081355924967603L;
    private int Bill;
    private int Coin;

public Money(){
    Bill = 0;
    Coin = 0;
}

public Money(int m){
    Bill = m/100;
    Coin = m%100;
}
    public String toString(){ 
        return String.format("$%d.%02d", Bill, Coin);   //.%02d sets the number of decimal places with the 0 showing what will come before
    }
}