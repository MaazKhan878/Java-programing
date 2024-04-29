package sortingParactic;

public class SortingAndSorting {
    public static void conqure(int []arr , int si, int mid, int ei){
        int merged[] = new int[ei - si + 1 ];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        for(int i = 0, j = si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void print(int []arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void divide(int []arr , int si, int ie){
        if(si>=ie){
            return;
        }
        int mid = si + (ie - si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ie);
        conqure(arr, si, mid, ie);
        
    }
    public static void main(String args[]){
        int []arr = {3,9,4,1,6,7};
        int n = arr.length;
        divide(arr, 0, n - 1);
        print(arr);
    }
}
    

