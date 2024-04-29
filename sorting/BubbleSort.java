package sorting;

public class BubbleSort {
    public static void print(int [] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void decending(int []array){
        for(int i = 0; i<array.length - 1; i++){
            for(int j = 0; j<array.length - i - 1; j++){
                if(array[j] < array[j + 1]){
                    int temp;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int [] array = {7,4,5,2,1,3};
        System.out.println("Befor Sorting");
        print(array);
        for(int i = 0; i<array.length - 1; i++){
            for(int j = 0; j<array.length - i - 1; j++){
                if(array[j]>array[j+ 1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                     }
            }
        }
        System.out.println("\nAfter sorting");
        print(array);
        System.out.println("\nDecending Sorting");
        decending(array);
        print(array);
    }
    
}
