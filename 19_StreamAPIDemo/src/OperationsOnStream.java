import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationsOnStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 2, 5, 12, 18, 11, 10, 24, 15, 18, 9, 0, 2, 1, 4);
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct() // --> Gives the distinct elements
                .sorted((a,b) -> b-a) // --> By default sorts in ascending order
                //.limit(4) --> This specifies how many elements do we need
                .skip(1) // --> This specifies how many elements to skip from the front
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
