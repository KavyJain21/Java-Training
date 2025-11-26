interface A{
    abstract void login();}
    class B implements A{
        public void login(){
        System.out.println("Hello");
    }
}
public class Q2 {
    public static void main(String[]args){
        B n1=new B();
        n1.login();
    }
}
