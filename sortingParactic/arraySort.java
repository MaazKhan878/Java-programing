package sortingParactic;
import java.util.Scanner;

import sorting.selectionSort;

public class arraySort {
    public static int[] arrayForm(){
        int n;
        System.out.print("Enter the number of Sort: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int []array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the number on Sort "+i+":");
            array[i] = scanner.nextInt();
         }
         return array;
    }
    public static void bubble(int []array){
        for(int i = 0; i<array.length - 1; i++){
            for(int j = 0; j<array.length - i - 1; j++){
                if(array[j + 1]>array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
    public static void print(int []array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void SelectionSort(int []array){
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
    public static void insertionSort(int[] array){
        int current;
        for(int i = 1; i<array.length; i++){
            current = array[i];
            int j = i - 1;
            while(j>=0 && current>array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void main(String args[]){
        int[] array = arrayForm();
        System.out.println("Bubble Sorting");
        print(array);
        bubble(array);
        print(array);
        System.out.println("Selection Sorting");
        int[] array2 = arrayForm();
        print(array2);
        SelectionSort(array2);
        print(array2);
        System.out.println("Insertion Sorting");
        int[] array3 = arrayForm();
        print(array3);
        insertionSort(array3);
        print(array3);

    }
    
}
