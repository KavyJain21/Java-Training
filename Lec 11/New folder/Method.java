interface A{
    void sleep();
    default void data(){
        System.out.println("heheheheeheh");
    }
    
}
class B implements A{
   public void sleep(){
 System.out.println("nadiaaaa");
   }
}
class C implements  A {
public void sleep(){
    System.out.println("jiii");
}
    
}
    public class Method {
     public static void main(String[] args) {
        B n1=new B();
        n1.sleep();
    }
}
