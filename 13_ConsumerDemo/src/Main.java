import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Viphul");
    }
}