package BitManipulation;
// get bit operation bit as one or zero
// set bit make them one
// clear bit make them zero
// Updater bit to update bite make zero one and one to zero
import java.util.Scanner;

public class BitManipulation {
    public static void getBit(){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit wise Zero");
        }
        else{
            System.out.println("bit wise one");
        }
        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;
        if((bitMask1 | n1) == 0){
            System.out.println("Bit wise zero");
            int newNumber = bitMask1 | n1;
            System.out.println(newNumber);
        }
        else{
            System.out.println("Bit wise one");
            int newNumber = bitMask1 | n1;
            System.out.println(newNumber); 
        }
        int n2 = 5;
        int pos2 = 2;
        int bitMask2 = 1<<pos2;
        int notBitMask = ~bitMask2;
        int newNumber1 = notBitMask & n2;
        System.out.println(newNumber1);
        
        int n3 = 5;
        int pos3 = 1;
        int num;
        System.out.println("Enter 1 for to clear\nEnter 2 for Set");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        switch(num){
            case 1:{
                int maskbit3 = 1<<pos3;
                int notMask3 = ~maskbit3;
                int number3 = notMask3 & n3;
                System.out.println(number3);
            }
            break;
            case 2:{
                int maskbit3 = 1<<pos3;
                int number3 = maskbit3 | n3;
                System.out.println(number3);
            }
        }
    }    
        public static void main(String args[]){
        getBit();

    }
}
