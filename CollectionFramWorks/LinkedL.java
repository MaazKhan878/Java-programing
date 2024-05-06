package CollectionFramWorks;
import java.util.*;
public class LinkedL {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(6);
        l.addFirst(3);
        l.addLast(67);
        System.out.println(l);
        l.clear();
        System.out.println(l);
        l.add(1); l.add(4); l.add(10);
        System.out.println(l.contains(1));
        System.out.println(l.element());
        System.out.println(l.get(0));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.indexOf(1));
        System.out.println(l.peek()+l.peekFirst()+l.peekLast());
        System.out.println(l.poll()+l.pollFirst()+l.pollLast());
        l.add(20);
        l.add(20);
        l.add(20);
        l.add(20);
        l.remove();
        l.removeFirst();
        l.removeLast();
        l.remove(0);
        System.out.println(l.size());
  }
    
}
