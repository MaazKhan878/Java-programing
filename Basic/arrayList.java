package Basic;
import java.util.ArrayList;
import java.util.Collections;



public class arrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get element
        int element = list.get(0);
        System.out.println(element);
        list.add(0,4);
        list.add(1,5);
        list.set(2,6);
        System.out.println(list);
        // delet element
        list.remove(2);
        System.out.println(list);
        // array list size
        int size = list.size();
        System.out.println(size);
        // loops/itration
        System.out.println("Itration");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
            
        }
        // Sorting through Function accending order
        Collections.sort(list);
        System.out.println("");
        System.out.println(list);
    }
    
    
}
