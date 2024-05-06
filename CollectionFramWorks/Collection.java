package CollectionFramWorks;
import java.util.*;
abstract class  CollectionName{
    ArrayList<Integer> a = new ArrayList<>();
    LinkedList<Integer> l = new LinkedList<>();
    HashMap<Integer,Float> h = new HashMap<>();

}
class ArrayL{
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(0,10);
        for(int i: a){
            System.out.println(i);
        }
        a.remove(2);
        System.out.println(a);
        a.add(2,3);
        a.add(2);
        a.add(3);
        a.add(5);
        System.out.println(a);
        a.clear();
        System.out.println(a);
        a.addFirst(2);
        a.addLast(6);
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.clone());
        a.remove(1);
        System.out.println(a);
        a.add(4);
        System.out.println(a.contains(4));
        a.ensureCapacity(50);
        System.out.println(a);
        System.out.println(a.indexOf(4));
        System.out.println(a);
        
    }
}

