import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 2;
        System.out.println(supplier.get());
    }
}