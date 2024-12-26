package enset.zakariae;

public class StrategyImpl implements Strategy {

    @Override
    public void effectuerOperation() {
        System.out.println("Default Strategy");
    }
}
