package Basic;
import java.util.*;
// Consume time less is compare to sample string
// it point same area and made modification




public class StringBD {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Maaz Khan");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        // char set on index
        sb.setCharAt(0,'h');
        System.out.println(sb);
        // Insert char in it
        sb.insert(0,'M');
        System.out.println(sb);
        // inser on second index
        sb.insert(1,'a');
        System.out.println(sb);
        // Delet char
        sb.delete(1,3);
        System.out.println(sb);
        // append char
        sb.append(" ");
        sb.append("f");
        System.out.println(sb);
        sb.append("rom");
        System.out.println(sb);
        // length
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);

        
    }
}
