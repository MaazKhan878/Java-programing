package recursion;
import java.util.*;
public class subset {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
        
    }
    public static void Findsubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        // add subset
        subset.add(n);
        Findsubset(n - 1, subset);
        // not add
        subset.remove(subset.size() - 1);
        Findsubset(n - 1, subset);
    }
    public static void main(String args[]){
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        Findsubset(n, list);
    }
    
}
