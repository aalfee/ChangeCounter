public class Nickel extends Coin{
    public int quantity = 1;

    public Nickel () {
          super (5);
       
    }

    public Nickel(int q){
          super(25);
          quantity = q;
    }
    
    public String toString(){
          return (quantity+" ");
    }
}
