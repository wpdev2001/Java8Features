import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6);
        Stream<Integer> integerStream = list.parallelStream();
        //Parallel stream works exactly like a stream with a little difference,
        // 1. it is used in case of huge collection and we want to perform the parallely
        // 2. It is not recommended to use it frequently as it takes more time due to each thread is assigned to different proces
        // Get more info again??

    }
}
