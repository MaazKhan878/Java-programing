package recursion;

public class StringReverse {
    public static void reversString(String str, int length){
        System.out.print(str.charAt(length));
        if(length == 0){
            return;
        }
        reversString(str, length - 1);
        
    }
    public static int first = -1;
    public static int last =  -1;
    public static void finder(String str, char ch, int indx){
        if(indx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentCh = str.charAt(indx);
        if(currentCh == ch){
            if(first == -1){
                first = indx;
            }
            else{
                last = indx;
            }
        }
        finder(str,ch,indx + 1);
    }
    public static boolean strickIncreasing(int[] array, int ind){
        if(ind == array.length - 1 ){
            return true;
        }

        if(array[ind]<array[ind + 1]){
            return strickIncreasing(array, ind + 1);
        }
        else{
            return false;
            
        }

    }
    public static void main(String args[]){
        String name = "Maaz";
        for(int i = 0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println("");
        String str = "Fawad Khan";
        reversString(str, str.length() - 1);
        System.out.println("");
        String string = "Fawad";
        finder(string, 'a', 0);
        int[] array1 = {1,2,3,4,5};
        boolean fr = strickIncreasing(array1, 0);
        if(fr == true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }

    }

    
}
