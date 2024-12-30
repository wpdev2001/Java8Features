interface Parent{
     default void sayHello(){
         System.out.println("Hello");
     }
}

class Child implements Parent{
//If this class doesn't provide any implementation then the default method of Interface is called
//    public void sayHello(){
//        System.out.println("This is Child's method");
//    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}