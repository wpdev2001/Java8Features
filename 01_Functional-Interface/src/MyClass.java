interface A{
    default void sayHello(){
        System.out.println("This is A's method");
    }
}

interface B{
    default void sayHello(){
        System.out.println("This is B's method");
    }
}
public class MyClass implements A,B {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}
