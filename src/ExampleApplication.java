import java.util.Scanner;
abstract class Strategy {
    public abstract int execute(int a,int b);
}
class ConcreteStrategyadd extends Strategy{

    @Override
    public int execute(int a, int b) {
        return(a+b);
    }
}
class ConcreteStrategymulitply extends Strategy{

    @Override
    public int execute(int a, int b) {
        return(a*b);
    }
}
class ConcreteStrategysubtract extends Strategy{
    @Override
    public int execute(int a,int b ){
        return(a-b);
    }

}
class Context{
    public Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy= strategy;
    }
    public int executeStrategy(int a,int b){
        return strategy.execute(a, b);
    }
}
public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operator:");
        String operator = scanner.nextLine();
        if (operator.equals("*")) {
            context.strategy = new ConcreteStrategymulitply();
            int multiply = context.executeStrategy(5, 13);
            System.out.println(multiply);
            ConcreteStrategymulitply obj1 = new ConcreteStrategymulitply();
            context.setStrategy(new ConcreteStrategymulitply());

        }
        else if (operator.equals("+")) {
            context.strategy = new ConcreteStrategyadd();
            int add = context.executeStrategy(5, 13);
            System.out.println(add);
            context.strategy = new ConcreteStrategyadd();
            ConcreteStrategyadd obj2 = new ConcreteStrategyadd();
            context.setStrategy(new ConcreteStrategyadd());
        }
        else if (operator.equals("-")) {
            context.strategy = new ConcreteStrategysubtract();
            int subtract = context.executeStrategy(5, 13);
            System.out.println(subtract);
            ConcreteStrategysubtract obj3 = new ConcreteStrategysubtract();
            context.setStrategy(new ConcreteStrategysubtract());

        }
    }
}