interface A{
    void login();
}
interface C{
    void login();
}
    class B implements A,C{
        public void login(){
        System.out.println("Tuta hua saaz");
      
    }
}

public class Multiple {
    public static void main(String[] args) {
        B n1=new B();
        n1.login();
    }
}
