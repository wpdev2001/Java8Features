import java.util.Arrays;
import java.util.List;

public class SumOfEvenPredicate{

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,2,4,6,4,3,6,7,6,4,434,7,9,4,5,0);
        //Sum of even using stream and predicate
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);

        //Sum of even numbers using normal approach
        int sum1=0;
        for(int n : list){
            if(n%2==0){
                sum1+=n;
            }
        }
        System.out.println(sum1);

    }

}
