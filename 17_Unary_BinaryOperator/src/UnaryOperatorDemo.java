import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        //Example of function
        Function<Integer,Integer> function1 = x -> x*x;
        Function<String,String> function2 = s -> s.toLowerCase();

        //When our passing argument type and return type is same then in that case we use Unaryoperator
        UnaryOperator<Integer> unaryOperator = x -> x*x;
        System.out.println(unaryOperator.apply(2));

        UnaryOperator<String> unaryOperator1 = s -> s.toLowerCase();
        System.out.println(unaryOperator1.apply("HELLO"));
    }
}