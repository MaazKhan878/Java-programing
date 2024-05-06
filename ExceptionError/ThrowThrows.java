package ExceptionError;
class NegativeRediusExc extends Exception{
    public String toString(){
        return "Negative Redius Exception";
    }

}

public class ThrowThrows {
    public static double floatArea(int r) throws NegativeRediusExc{
        if(r<0){
            throw new NegativeRediusExc();
        }
        double result = Math.PI * r;
        return result;
    }
    public static int divide(int a, int b){
        int result = a/b;
        return result;
    }
    public static void main(String[] args) throws ArithmeticException{
        try{
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);

        }
        try{
            double ar = floatArea(-4);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
