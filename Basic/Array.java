package Basic;
import java.util.Arrays;
public class Array {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int arr1[][] = new int[2][5];
        arr1[0] = new int[]{1,2,3,4,5};
        arr1[1] = new int[]{2,34,56,2};
        int arr2[][][] = {{{1,2,3,4},{45,23,1,3}},{{123,223,12,23},{23,12,34,12}}};
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[i].length; j++){
                for(int k = 0; k<arr2[i][j].length; k++){
                    System.out.print(arr2[i][j][k]+",");
                }
                System.out.println();
            }
        }
      
        for(int i[][]:arr2){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
        int arr3[][][] = new int[2][2][4];
        arr3[0][0]= new int[]{1,2,3,4};
        arr3[0][1] = new int[]{4,5,6,7};
        arr3[1][0] = new int[]{4,5,6,7};
        arr3[1][1] = new int[]{4,5,6,7};
        System.out.println(Arrays.deepToString(arr3));
        for(int i[][]:arr3){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
    
    
}
