package sortingParactic;

public class SortingBySort {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void Bublle(int arr[]){
        for(int i = 0; i<arr.length - 1; i++){
            int temp;
            for(int j = 0; j<arr.length - 1 - i; j++){
                if(arr[j]<arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        
        }
    }
    public static void SelectionSort(int arr[]){
        int smallest;
        for(int i = 0; i< arr.length - 1; i++){
            smallest = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void insertion(int arr[]){
        for(int i = 1; i<arr.length ; i++){
            int current = arr[i];
            int j = i - 1;
            while(j>=0 && current>=arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    public static void conqure(int arr[], int s, int m, int e){
        int indx1 = s;
        int indx2 = m + 1;
        int x = 0;
        int merged[] = new int[e - s + 1];
        while(indx1 <= m && indx2 <= e){
            if(arr[indx1]<= arr[indx2]){
                merged[x++] = arr[indx1++];
            }
            else{
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1<=m){
            merged[x++] = arr[indx1++];
        }
        while(indx2<=e){
            merged[x++] = arr[indx2++];
        }
        for(int i = 0, j = s; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int m = s + (e - s)/2;
        divide(arr, s, m);
        divide(arr, m + 1, e);
        conqure(arr, s, m, e);
        
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j<high; j++){
            if(arr[j] > pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pIndx = partition(arr, low, high);
            quickSort(arr, low, pIndx - 1);
            quickSort(arr, pIndx + 1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {3,1,5,4,7,8};
        print(arr);
        System.out.println();
        Bublle(arr);
        print(arr);
        System.out.println("\n Selection");
        SelectionSort(arr);
        print(arr);
        System.out.println("\n Insertion");
        insertion(arr);
        print(arr);
        System.out.println("\n Merged Sorting");
        int n = arr.length;
        divide(arr, 0, n - 1);
        print(arr);
        System.out.print("\n Quick sort\n");
        quickSort(arr, 0, n - 1);
        print(arr);
    }
    
}
