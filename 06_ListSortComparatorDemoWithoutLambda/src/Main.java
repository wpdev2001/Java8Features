import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Descending sort using Comparator
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(32);
        list.add(22);
        list.add(322);
        list.add(20);
        list.add(25);

        Collections.sort(list,new MyClass()); //The second parameter over is the Comparator

        System.out.println(list);

    }
}