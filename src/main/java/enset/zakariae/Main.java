package enset.zakariae;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        /*context.effectuerOperation();
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
       */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quelle Strategie ?");
            String str=scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName("enset.zakariae.StrategyImpl"+str).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}