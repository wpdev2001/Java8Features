import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        //BifunctionDemo
        BiFunction<String,String,Integer> biFunction = (s1,s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("AAA","BBBB"));

        //It is an alternative for Bifunction, when we know that all the types are same.
        BinaryOperator<String> binaryOperator = (s1,s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("Hello","World"));
    }
}
