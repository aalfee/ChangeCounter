public class Dime extends Coin{
      public int quantity = 1;

      public Dime () {
            super (10);
         
      }

      public Dime(int q){
            super(25);
            quantity = q;
      }
      
      public String toString(){
            return (quantity+" ");
      }
}