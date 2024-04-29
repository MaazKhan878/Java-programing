package recursion;
import java.util.*;
public class RecursionNumber {
    public static void number(int n){
        System.out.print(n+" ");
        if(n == 1){
            return;
        }
        number(n - 1);
    }
    public static void numberinc(int n){
        System.out.print(n+" ");
        if(n == 5){
            return;
        }
        numberinc(n + 1);
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);

    }
    // next method
    public static void sum2(int i, int n, int sum){
        sum+=i;
        if(i == n){
            System.out.println(sum);
            return;
        }
        sum2(i + 1, n, sum);

    }
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int fibonnaci(int n){
        // f(0) = 0
        // f(1) = 1
        // f(n) = f(n - 1) + f(n - 2)
        // f(2) = f(2 - 1) + f(2 - 2) = f(1) + f(0) = 1
        // f(3) = f(3 - 1) + f(3 - 2) = f(2) + f(1) = 1 + 1 = 2
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fib =fibonnaci(n - 1) + fibonnaci(n - 2);
        return fib;
    }
    public static void fib2(int a, int b, int n){
        if(n <= 0 ){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fib2(b,c,n - 1);

    }
    // given data x and n
    // work x = x * (x ^ n-1) = x^n-1+1=x^n
    // Base case x^0 = 1, x = 0 = 0
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        return x * power(x, n - 1);
    }
    public static void main(String args[]){
        int n = 5;
        number(n);
        System.out.println("\n????");
        numberinc(1);
        System.out.println("\n________________");
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Sum: "+sum(num));
        sum2(1,5,0);
        System.out.println("Factorial: "+factorial(num));
        System.out.println("Fibonnaci: "+fibonnaci(num));
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fib2(a, b, num - 2);
        System.out.println("Power: "+power(2, num));

        

    }
}
