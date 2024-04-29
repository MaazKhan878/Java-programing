package sorting;

public class insertionSort {
    public static void print(int []array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void deccending(int []array){
        int current;
        for(int i = 1; i<array.length; i++){
            current = array[i];
            int j = i - 1;
            while(j>=0 && current > array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void main(String args[]){
        int current;
        int array[] = {6,3,4,1,2,8};
        for(int i = 1; i<array.length; i++){
            current = array[i];
            int j = i -1;
            while(j>=0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println("Accending order");
        print(array);
        System.out.println("\nDeccending order");
        deccending(array);
        print(array);
    }
    
}
