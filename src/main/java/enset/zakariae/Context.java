package enset.zakariae;

public class Context {
   private Strategy strategy = new StrategyImpl();;

   public void effectuerOperation() {
      System.out.println("***************************");
      strategy.effectuerOperation();
       System.out.println("***************************");

   }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
