package recursion;

public class lastAdd {
    public static int count = 0;
    public static void addCharacter(String str, int indx, String newStr, char chr){
        if(indx == str.length()){
            for(int i = 0; i<count; i++){
                newStr+=chr;
            }
            System.out.println(newStr);
            return;
        }
        char currentCh = str.charAt(indx);
        if(str.charAt(indx) != chr){
           newStr+= currentCh;
           addCharacter(str, indx + 1, newStr, chr);
        }
        else{
            count++;
            addCharacter(str, indx + 1, newStr, chr);
        }
    }
    public static void main(String args[]){
        String name = "axbcxxd";
        addCharacter(name, 0, "",'x');
    }
}
