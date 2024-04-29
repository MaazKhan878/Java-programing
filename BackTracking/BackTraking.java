package BackTracking;
// Backtracking
// Define : Find all possible salution then using one of them
// e.g: if there are three childern 
// then arrange three childern 
// the arrangement well made different and check the possibility of all arrangement then we choser oneof them
// A, B, C
// A, then two choice to give second position to B Or C SO the arrangement well be ABC or ACB
// B, then second position A,C so BAC, BCA
// C THen CAB, CBA
// Total arrangement as 6 ABC ACB BAC BCA CAB CBA
// Permutation n! comination like 3!= 3 X 2 X 1 = 6 combination;
// its visualized in recursion back tracking concept
// recursion analyzed in tree form it make it simple
//  

public class BackTraking {
    public static void tracking(String str, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            tracking(newStr, perm + current);
            
        }
    }

    // public static void main(String args[]){
    //     tracking("ABC", "");
    // }
    
}
class A{
    int x = 10;
    class B{
        int y = 15;
    }
    static class E{
        int k = 69;
    }
}
class D{
    public static void main(String args[]){
        A a = new A();
        A.B b = a.new B();
        System.out.println(b.y +" "+a.x);
        A.E e  = new A.E();
        System.out.println(e.k);
    }
}

