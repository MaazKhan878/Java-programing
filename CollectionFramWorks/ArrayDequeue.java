package CollectionFramWorks;
import java.util.*;
public class ArrayDequeue {
    // Dequeue mean double queue insertion and delation from both side
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>(25);
        d.add(1);
        d.addFirst(3);
        d.addLast(5);
        System.out.println(d);
        System.out.println(d.element());
        d.remove();
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d.peekLast());
        System.out.println(d.getFirst());
        System.out.println(d.poll());
        System.out.println(d);
        d.add(3);
        d.push(4);
        System.out.println(d.pop());
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d);
    }
}
