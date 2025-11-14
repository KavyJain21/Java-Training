

public class Ques2 {
    public static void main(String[] args) {
        String str="I LOVE YOU";
        String a[]=str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String ele:a){
                StringBuilder val = new StringBuilder(ele);
                result.append(val.reverse().append(" "));
        } System.out.println(result);
    }
}
