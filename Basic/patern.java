package Basic;

public class patern {
    public static void main(String args[]){
        int n = 4;
        int n2 = 5;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("New patern");
        int n1 = 4;
        int m1 = 5;
        for(int i = 0; i<n1; i++){
            for(int j = 0; j<m1; j++){
                if(i == 0 || i == 3){
                    System.out.print("*");
                }
                else if(j == 0 || j == m1 - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        System.out.println("New patern");
        int StarIncrease = 1;
        for(int i = 1; i<=n1; i++){
            for(int j = 1; j<=StarIncrease; j++){
                System.out.print("*");
            }
            if(StarIncrease <= n1){
                StarIncrease+=1;
            }
            System.out.println("");
        }
        System.out.println("New patern");
        int SpaceDecreased = 3;
        int starInc = 1;
        for(int line = 1; line<=n1; line++){
            for(int i = 1; i<=SpaceDecreased; i++){
                System.out.print(" ");
            }
            for(int j = 1; j<=starInc; j++){
                System.out.print("*");
            }
            if(line <= n1){
                SpaceDecreased--;
                starInc++;
            }
            System.out.println("");
        }
    }
    
}
