package recursion;

public class permutation {
    public static void Permutation(String str, String combination){
        if(str.length() == 0){
            System.out.println(combination);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            Permutation(newStr, combination + currentChar);
        }
    }
    public static int countPath(int i, int j,int n, int m){
        if(i == n - 1 || j == n - 1){
            return 1;
        }
        if(i == n || j == n){
            return 0;
        }
        int downPath = countPath(i + 1, j, n, m);
        int rightPath = countPath(i, j + 1, n, m);
        return downPath + rightPath;
    }
    
    public static void main(String args[]){
        String name = "Abcd";
        Permutation(name, "");
        System.out.println("");
        int n = 3, m = 4;
        System.out.println(countPath(0, 0, n, m));
    }
}
