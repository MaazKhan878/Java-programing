package sorting;
// sorted by selction 
// select one according condition then exchange the index 
public class selectionSort {
    public static void print(int []array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void descending(int [] array){
        int largest;
        for(int i = 0; i<array.length - 1; i++){
            largest = i;
            for(int j = i + 1; j<array.length; j++){
                if(array[largest] < array[j]){
                    largest = j;
                }
            }
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String args[]){
        int []array = {7,5,4,6,3,2,1};
        for(int i = 0; i<array.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j<array.length; j++){
                if(array[smallest] > array[j] ){
                    smallest = j;

                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.println("Accending order");
        print(array);
        System.out.println("\n Deccending order");
        descending(array);
        print(array);
    }
    
}
