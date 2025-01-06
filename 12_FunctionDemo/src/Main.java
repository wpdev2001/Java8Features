import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> functionDemo = x -> x.length();
        System.out.println(functionDemo.apply("Piyush"));
    }
}