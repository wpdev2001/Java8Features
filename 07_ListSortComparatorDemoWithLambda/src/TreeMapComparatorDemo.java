import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorDemo {
    public static void main(String[] args) {

        //By default it internally sort in ascending order
        Map<Integer,String> m1 = new TreeMap<>();
        m1.put(22,"AAA");
        m1.put(11,"BBB");
        m1.put(33,"CCC");
        m1.put(12,"DDD");
        System.out.println("TreeMap before sorting: " + m1);

        //Using comparator and lambda to sort the treemap in descending order
        Map<Integer,String> m2 = new TreeMap<>((a,b) -> b-a);
        m2.put(22,"AAA");
        m2.put(11,"BBB");
        m2.put(33,"CCC");
        m2.put(12,"DDD");
        System.out.println("TreeMap after sorting: " + m2);
    }
}
