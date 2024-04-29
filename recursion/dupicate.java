package recursion;

public class dupicate {
    // this one as efficient
    
    public static void removeDuplicate(String str, String newStr, int indx){
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(indx);
        if(!newStr.contains(String.valueOf(current))){
            newStr+=current;
        }
        removeDuplicate(str, newStr, indx + 1);
    }
    // not efficient
    // Another metod
    // public static boolean[] map = new boolean[26];
    // public static void removeDuplicate(String str, String newStr, int indx){
    //     if(indx == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char current = str.charAt(indx);
    //     if(map[current - 'a'] == true){
    //         removeDuplicate(str, newStr, indx + 1);
    //     }else{
    //         newStr+=current;
    //         map[current - 'a'] = true;
    //         removeDuplicate(str, newStr, indx + 1);
    //     }
    //}
    public static void main(String args[]){
        String name = "maaz  Khan  zzDer  good";
        removeDuplicate(name, "", 0);
    }
    
}
