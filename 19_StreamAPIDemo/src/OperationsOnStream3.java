import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnStream3 {
    public static void main(String[] args) {

        Integer integer = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .map(x -> x / 2)
                .distinct()
                .peek(System.out::println)
                .max((a,b) -> a-b)
                .get();

        System.out.println("MAX: " + integer);
    }
}
