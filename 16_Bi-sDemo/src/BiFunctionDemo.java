import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {

        Function<String, Integer> function1 = str -> str.length();
        System.out.println(function1.apply("Viphul"));

        BiFunction<String,String,Integer> function2 = (s1,s2) -> s1.length() + s2.length();
        System.out.println(function2.apply("shreyash","piyush"));

    }
}
