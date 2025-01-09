import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumingList {
    public static void main(String[] args) {

        Consumer<List<Integer>> listConsumer1 = li ->{
            for(Integer i : li){
                System.out.println(i+10);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li ->{
            for(Integer i : li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> listConsumer = listConsumer1.andThen(listConsumer2);
        listConsumer.accept(Arrays.asList(1,2,3,4,5));

    }
}
