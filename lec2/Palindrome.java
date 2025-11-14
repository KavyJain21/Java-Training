import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
          String str="MADAM";
    int j =str.length()-1;
    int n=2;
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)==str.charAt(j)){
            n=1;
        }else{
            n=0;
        }j--;
    }
    if(n==1){
        System.out.println("Palindrome");
    }else{
        System.out.println("Nope");
    }
    }
}

