

import java.util.HashMap;

public class Ques2 {
     public static void main(String[] args) {
        //Create
      
        String str="aabcad";
          HashMap<Character,Integer>hm=new HashMap<>();
          for(char ch:str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
          }
          System.out.println(hm);
          for(char ch:str.toCharArray()){
            if(hm.get(ch)==1){
                System.out.println(ch);
                break;
            }
          }

}
}