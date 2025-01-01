import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Descending sort using Comparator with using lambda function
public class ListComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(32);
        list.add(22);
        list.add(322);
        list.add(20);
        list.add(25);

//        Collections.sort(list,(a,b) -> a-b); --> Ascending sort
        Collections.sort(list,(a,b) -> b-a); // --> For descending sorting
        System.out.println(list);

    }
}