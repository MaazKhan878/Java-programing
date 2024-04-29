package BitManipulation;

public class bitParactice {
    public static void main(String args[]){
        // left shift
        // 0101 pos by 2
        // 0100 
        // and
        // 0100 = 4
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int number = bitMask & n;
        int number1 = bitMask | n;
        System.out.println(number);
        //0101 by pos 2
        //0100
        // or
        //0101 = 5
        System.out.println(number1);
        // right shift
        // 0101 by pos 2
        // 0001
        // and
        // 0001 = 1
        int n1 = 5;
        int pos1 = 2;
        int bitMask1 = pos1>>1;
        int number2 = bitMask1 & n1;
        System.out.println(number2);
        // 0101 by pos 2
        // 0001
        // or
        // 0101 = 5
        int numberOr = bitMask1 | n1;
        System.out.println(numberOr);
        // 0101 = 5
        // 0100
        // 1011
        // 0101
        //And 0001 = 1
        int num = 5;
        int posi = 2;
        int notBitMask = ~(1<<posi);
        int numberNot = notBitMask & num;
        System.out.println(numberNot);
        // 0101
        // 0100
        // xor 0001 = 1
        int num1 = 5;
        int posit = 2;
        int BitMask1 = (1 << posit);
        int numberNot1 = BitMask1 ^ num1;
        System.out.println(numberNot1);

        int notBitMask3 = ~(1 << posit);
        int numberWhat = notBitMask3 | num1;
        System.out.println(numberWhat); 
    }
    
}
