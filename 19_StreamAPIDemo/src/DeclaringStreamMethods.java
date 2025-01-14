import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DeclaringStreamMethods {
    public static void main(String[] args) {

        //Through List
        List<String> list = Arrays.asList("apple", "mango", "banana");
        Stream<String> myStream = list.stream();

        //Through Array
        String[] array = {"AAA","BBB","CCC","DDD"};
        Stream<String> stream = Arrays.stream(array);

        //Through Stream.of
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

        //Through Stream.iterate
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(10);

        //Through Stream.generate
        Stream<Integer> limit1 = Stream.generate(() -> (int)Math.random() * 100).limit(10);

    }
}
