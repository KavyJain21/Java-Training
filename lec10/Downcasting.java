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
public class Downcasting {
    public static void main(String[] args) {
        Animal s1=new Dog();
        s1.eat();
        Dog s2=(Dog)s1;
    }
}


