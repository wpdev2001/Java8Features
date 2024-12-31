public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Hello " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.run();

        for(int i=0;i<10;i++){
            System.out.println("Main " + i);
        }
    }
}