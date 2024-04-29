package labtask;

public class Casting {
    public static void main(String args[]){
        double num1 = 22.0;
        double num2 = 23.0;
        int num3 = (int)num1;
        int num4 = (int)num2;
        double result = num1 + num2;
        int result1 = (int)result;
        System.out.printf("Double number %f and %f as Casting %d and %d",num1, num2, num3, num4);
        System.out.println();
        System.out.printf("Double result %f Casting to %d",result, result1);
        System.out.println();
        double division = (double)result1/(double)num4;
        int division1 = (int)result/(int)num2;
        System.out.printf("Int %d/%d result cast to double result: %f",result1, num4, division);
        System.out.println();
        System.out.printf("Double %f/%f result cast to int result: %d",result,num2,division1);
    }
    
}
