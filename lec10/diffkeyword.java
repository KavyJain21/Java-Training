class Parent{
    static void staticMethod(){
            System.out.println("parent static method");
    }
    void instanceMethod(){
        System.out.println("parent instance");
    }
    String name="ParentName";
}
class Child extends Parent{
    static void staticMethod(){
        System.out.println("child static class");
    }
    void instanceMethod(){
        System.out.println("child instance method");
    }
    String name="hello";
}

public class diffkeyword {
    public static void main(String[] args) {
        Parent p=new Child();
        p.instanceMethod();
        p.staticMethod();;
    }
}
