public class Quarter extends Coin {
      public int quantity = 1;

      public Quarter () {
            super (25);
         
      }

      public Quarter(int q){
            super(25);
            quantity = q;
      }
      
      public String toString(){
            return (quantity+" ");
      }
}
