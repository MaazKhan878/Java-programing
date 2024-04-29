package sortingParactic;

import sorting.insertionSort;

public class SortbySorts {
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = 0; j<arr.length - i - 1; j++){
                if(arr[j]>arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void SelectionSort(int arr[]){
        int largest;
        for(int i = 0; i<arr.length; i++){
            largest = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[largest] < arr[j]){
                    largest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j>=0 && current<arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    public static void conqure(int arr[], int s, int mid, int e){
        int indx1 = s;
        int indx2 = mid + 1;
        int x = 0;
        int merged[] = new int[e - s + 1];
        while(indx1<=mid && indx2<=e){
            if(arr[indx1] <= arr[indx2]){
                merged[x++] = arr[indx1++];
            }
            else{
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1<=mid){
            merged[x++] = arr[indx1++];
        }
        while(indx2<=e){
            merged[x++] = arr[indx2++];
        }
        for(int i = 0, j = s; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[] ,int s, int e){
        if(s>=e){
            return;
        }
        int mid = s + (e - s)/2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conqure(arr, s, mid, e);
    }
    public static int partition(int arr[], int low, int high){
        int pivote = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivote){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivote;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low <= high){
            int pivoteIndx = partition(arr, low, high);
            quickSort(arr, low, pivoteIndx - 1);
            quickSort(arr, pivoteIndx + 1, high);
        }
    }
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,4,3,1,32,40};
        System.out.println("Bubble Sorting");
        print(arr);
        bubbleSort(arr);
        System.out.println();
        print(arr);
        System.out.println("\nSelection Sort");
        int arr2[] = {4,5,2,6,7};
        print(arr2);
        System.out.println();
        SelectionSort(arr2);
        print(arr2);
        System.out.println("\nInsertion Sort");
        int arr3[] = {4,1,7,3,8};
        print(arr3);
        InsertionSort(arr3);
        System.out.println();
        print(arr3);
        System.out.println("\nMerged Sort");
        int arr4[] = {4,1,6,5,9};
        print(arr4);
        System.out.println();
        int n = arr4.length;
        divide(arr4, 0, n - 1);
        print(arr4);
        System.out.println("\n Quick Sort");
        int arr5[] = {4,2,6,7,2,45};
        print(arr5);
        System.out.println();
        int n1 = arr5.length;
        quickSort(arr5, 0, n1 - 1);
        print(arr5);
        
    }
}
