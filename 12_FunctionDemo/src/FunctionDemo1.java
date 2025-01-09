import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {

        Function<String,String> function1 = s -> s.toUpperCase();
        Function<String,String> function2 = s -> s.substring(0,3);

        System.out.println(function1.andThen(function2).apply("Viphul"));
    }
}
