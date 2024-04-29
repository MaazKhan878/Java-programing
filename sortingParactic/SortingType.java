package sortingParactic;

public class SortingType {
    public static void print(int []array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void selection(int []array){
        int smallest;
        for(int i = 0; i<array.length - 1; i++){
            smallest = i;
            for(int j = i + 1; j<array.length; j++){
                if(array[smallest] < array[j]){
                    smallest = j;

                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

    }
    public static void Insertion(int []array){
        int current;
        for(int i = 1; i<array.length; i++){
            current = array[i];
            int j = i - 1;
            while(j>=0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void main(String args[]){
        int []array = {5,6,3,4,9,1};
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j<array.length - 1 - i; j++){
                if(array[j + 1] > array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Bubble method");
        print(array);
        System.out.println("\nSlection method");
        int []array2 = {4,5,6,2,1};
        selection(array2);
        print(array2);
        System.out.println("\nInsertion method");
        int []array3 = {0,3,4,8,8,10};
        Insertion(array3);
        print(array3);
    }
    
}
