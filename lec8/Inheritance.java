class Animal{
    void eat(){
        System.out.println("SPARROW AAP KYA KAR RAHE HOO");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("OUCHHHHHH");
    }
}


public class Inheritance {
    public static void main(String[] args) {
            Dog s1=new Dog();
          
            s1.eat();s1.bark();
     }
}
 