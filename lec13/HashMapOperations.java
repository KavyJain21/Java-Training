
import java.util.*;
public class HashMapOperations {
    public static void main(String[] args) {
        //Create
        HashMap<Integer,Integer>hm=new HashMap<>();
        //Insert
        hm.put(1, 100);
        hm.put(2, 150);
    
        System.out.println(hm);
       
      System.out.println(hm.get(1));
      System.out.println(hm.getOrDefault(11, 3));
      for(int x:hm.keySet()){
        System.out.println(hm.get(x));
      }
      
    }
}
