public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();
        for(int i=0;i<10;i++){
            System.out.println("Main " + i);
        }
    }
}