import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnStream2 {
    public static void main(String[] args) {

        List<Integer> collect = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
