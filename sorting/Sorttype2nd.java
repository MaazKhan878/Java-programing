package sorting;

public class Sorttype2nd {
    public static void printArray(int []arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bublle2nd(int []arr){
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = i + 1; j<arr.length; j++){
                int temp;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }

    }
    public static void Selection(int []arr){
        for(int i = 0; i<arr.length - 1; i++){
            int largest = i;
            for(int j = i + 1; j<arr.length; j++ ){
                if(arr[largest] > arr[j]){
                    largest = j;

                }
            }
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Insertion(int []arr){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j>=0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    public static void main(String arg[]){
        int []arr = {2,4,9,1};
        bublle2nd(arr);
        printArray(arr);
        System.out.println("\nSelection");
        int []arr2 = {2,4,9,1};
        Selection(arr2);
        printArray(arr2);
        System.out.println("\n Insertion");
        int []arr3 = {2,4,9,1};
        Insertion(arr3);
        printArray(arr3);
    }
    
}
