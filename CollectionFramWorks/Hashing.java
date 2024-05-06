package CollectionFramWorks;
import java.util.*;
public class Hashing {
    // Increased search power
    // in Large array
    // through key
    // Hash Collision when same index have to number like 11/10 = 1 and 21/10 = 1 both on same index
    // For this the value store in spaces
    // on every index there use LinkedList RWason: 1 index have more then one number stored
    // Important Classes: HashSet, HashMap, LinkedHashMap, HashTable -> Collection -> technique for fast search
    // Load Factor: Capacity Of HashSet capacity double
    // Hash Set: Collection of set(repeation not allowed like [1,1] not allowed but [1,2])
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(1);
        myHashSet.add(11);
        myHashSet.add(12);
        myHashSet.add(12);
        myHashSet.add(6);
        myHashSet.add(6);
        System.out.println(myHashSet);// repeatation not allowed like above example 12,12 only 12 take and 6,6 only 6
        myHashSet.clear();
        System.out.println(myHashSet);
        myHashSet.add(6);
        myHashSet.remove(6);
        System.out.println(myHashSet);
        // For More Function visite oracle
        
    }
    
}
