package ExceptionError;
import java.util.*;
class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + "I am toString()";

    }
    public String getMessage(){
        return "I am Message";
    }
}
public class ExceptionClass {
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try{
                 throw new MyException();
            }
            catch(Exception e){
                  System.out.println(e.getMessage());
                  System.out.println(e.toString());
                  System.out.println(e);
                  e.printStackTrace();
            }
        }
    }
    
}
