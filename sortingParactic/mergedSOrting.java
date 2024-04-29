package sortingParactic;

public class mergedSOrting {
    public static void conqure(int arr[], int s, int mid, int e){
        int indx1 = s;
        int indx2 = mid + 1;
        int x = 0;
        int merged[] = new int[e - s + 1];
        while(indx1 <= mid && indx2 <= e){
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
        for(int i = 0, j = s; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int []arr , int s, int e){
        if(s>=e){
            return;
        }
        int mid = s + (e - s)/2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conqure(arr, s, mid, e);
    }
    public static void print(int []arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int []arr = {3,6,7,2,3,10};
        int n = arr.length;
        
        divide(arr, 0, n - 1);
        print(arr);
    }
    
}
