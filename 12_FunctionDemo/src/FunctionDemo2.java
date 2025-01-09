import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        Function<Integer,Integer> function1 = x -> 2*x;
        Function<Integer,Integer> function2 = x -> x*x*x;

        System.out.println(function1.andThen(function2).apply(2)); //case1
        System.out.println(function2.andThen(function1).apply(2)); //case2

        //Compose --> It is same as the case 2 above there is no any difference
        System.out.println(function1.compose(function2).apply(2));

        //Identity function
        Function<String,String> identityFunc = Function.identity();
        System.out.println(identityFunc.apply("Viphul"));


    }
}
