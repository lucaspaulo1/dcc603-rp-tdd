class Dollar extends Money{
   private int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
   void times(int multiplier) {
      amount= amount * multiplier;
   }
}	
