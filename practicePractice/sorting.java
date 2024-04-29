package practicePractice;

public class sorting {
    public static void Bsorting(int arr[]){
        for(int i = 0; i< arr.length - 1; i++){
            for(int j = 0; j< arr.length - 1 -i; j++){
                int temp = 0;
                if(arr[j]>arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void insertionS(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j>=0 && current > arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {4,3,1,6};
        Bsorting(arr);
        print(arr);
        insertionS(arr);
        System.out.println();
        print(arr);
        
        
    }
    
}
