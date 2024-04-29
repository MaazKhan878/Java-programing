package Hashing;
// what is hashmaping?
// Used we store pair like roll number with name 
// two things 1: Key = which always unique like roll number
// 2: value = which may be not unique like name
// like Fuel | price
//      CNG  | 70
//     diesel| 80
//     petrol| 90
//     unique | can be same
import java.util.*;
public class HashMaping {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        // Insertion operation
        map.put("Pakistan", 30);
        map.put("India", 130);
        map.put("China", 133);
        // inorder maps 
        // no gurantee to print in order
        System.out.println(map);
        // the key never change but the value can change like
        map.put("China", 150);
        System.out.println(map);
        // Search operation or look up operation
        // see the pair present or not
        if(map.containsKey("indonesia")){
            System.out.println("Present in the map");
        }
        else{
            System.out.println("Not present");
        }
        // check key value
        System.out.println(map.get("China"));
        System.out.println(map.get("America"));
        // iteration
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" = "+ e.getValue());
        }
        map.remove("India");
        System.out.println(map);
    }
    
}
