package recursion;

public class keymaping {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
    public static void printComb(String str, String combination, int indx){
        if(indx == str.length()){
            System.out.println(combination);
            return;
        }
        char current = str.charAt(indx);
        String mapping = keypad[current - '0'];
        for(int i = 0; i<mapping.length(); i++){
            printComb(str, combination+mapping.charAt(i), indx + 1);
        }

    }
    public static void main(String args[]){
        printComb("23", "",0);

    }
    
}
