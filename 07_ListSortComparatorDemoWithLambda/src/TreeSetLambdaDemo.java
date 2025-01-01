import java.util.Set;
import java.util.TreeSet;

public class TreeSetLambdaDemo {
    public static void main(String[] args) {

        //By default it internally sort in ascending order
        Set<Integer> ts1 = new TreeSet<>();
        ts1.add(11);
        ts1.add(9);
        ts1.add(20);
        System.out.println("Before sorting the Set: " + ts1);

        //Using comparator and lambda to sort the treeset in descending order
        Set<Integer> ts2 = new TreeSet<>((a,b) -> b-a);
        ts2.add(11);
        ts2.add(9);
        ts2.add(20);
        System.out.println("After sorting the Set: " + ts2);

    }
}
