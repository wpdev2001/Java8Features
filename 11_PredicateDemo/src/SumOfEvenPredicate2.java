import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SumOfEvenPredicate2 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x%2==0;
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = 0;

        for(int n : list){
            if(isEven.test(n)){
                System.out.println(n);
            }
        }
    }
}
