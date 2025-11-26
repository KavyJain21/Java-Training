

import java.util.HashMap;

public class Ques1 {
      public static void main(String[] args) {
        //Create
        HashMap<Integer,Integer>hm=new HashMap<>();
        int arr[]={2,2,3,4,2,4,2};
        for(int x:arr){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }System.out.println(hm);
}
}