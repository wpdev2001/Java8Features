import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x%2==0;
        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x%2==0 && y%2==0;
        System.out.println(biPredicate.test(2,4));

        BiPredicate<String,Integer> biPredicate1 = (str,x) -> str.length()==x;
        System.out.println(biPredicate1.test("Visal",5));

    }
}