class Animal{
    void eat(){
        System.out.println("pizzaaa");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("laddu");
    }
    void data(){
        System.out.println("geela samosa");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Dog s1=new Dog();
        s1.eat();
    }
}
