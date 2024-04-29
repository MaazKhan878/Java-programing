package recursion;

public class placeTiles {
    public static int placetiles(int n, int m){
        //base case
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        // vertically placement
        int verticallyPlacement = placetiles(n - m, m);
        // Horizantal placement
        int horizentalPlacement = placetiles(n - 1, m);
        return verticallyPlacement + horizentalPlacement;
    }
    public static void main(String args[]){
        int n = 4, m = 2;
        System.out.println(placetiles(n, m));
    }
    
}
