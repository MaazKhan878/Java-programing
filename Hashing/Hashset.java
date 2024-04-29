package Hashing;
import java.util.HashSet;
import java.util.Iterator;
// Important Data Structure
// What is HashSet
// Set have unique element
// Set structure not allowed the Duplicate
// Time complexity are constant like add element remove element or search element all take samer time
// This data structure provide the constant time
public class Hashset {

    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(2); // it will not add in the set because set contains unique number

        // check the number exist or not
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        else{
            System.out.println("Set doesnot contains 2");
        }
        // Delete by set.remove
        set.remove(2);
        // Verify
        if(set.contains(2)){
            System.out.println("Set contains after remove");
        }
        else{
            System.out.println("2 remove from the set");
        }
        set.add(2);
        System.out.println("The size of set as "+set.size());
        // print all element
        System.out.println(set);
        // iterator
        Iterator it = set.iterator();
        // two function of iterator 
        // it.next function return next value in the start store null
        // hasNext return true and false if element present return true if not return false
        // No gurantee of element well be remain constant
        while(it.hasNext()){
            System.out.println(it.next());
        }

        
    }
    
}
