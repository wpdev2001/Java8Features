interface A1{
    static void sayHello(){
        System.out.println("Hello from A!");
    }

    default void sayBye(){
        System.out.println("Bye !");
    }
}

public class Myclass1 implements A1{
    public static void main(String[] args) {
        Myclass1 obj = new Myclass1();
        obj.sayBye();
        A1.sayHello(); //Static method will always called using Class/Interface name
    }

}