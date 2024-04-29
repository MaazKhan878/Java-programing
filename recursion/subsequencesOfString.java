package recursion;
import java.util.*;
public class subsequencesOfString {
    public static void subsequences(String str, String newStr, int indx, HashSet<String> set){
        if(indx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char current = str.charAt(indx);
        subsequences(str, newStr + current, indx + 1, set);
        subsequences(str, newStr, indx + 1, set);
    }
    public static void main(String args[]){
        String name = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(name, "", 0, set);
    }
}
 