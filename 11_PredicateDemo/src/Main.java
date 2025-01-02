import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 100000;
        System.out.println(predicate.test(1000000));
    }
}