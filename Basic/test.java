package Basic;
import java.util.Scanner;
class hello{
    public static void main(String[] args){
        System.out.println("Hellow world");
    }
}
class sum{
    public static void main(String[] args){
        String name = "sum";
        System.out.println(name);
        int a = 10;
        float b = 12;
        float sum = a + b;
        System.out.println(sum);


    }
}
class product{
    public static void main(String[] args){
        float a = 12.0f;
        float b = 13.6f;
        float c = a * b;
        System.out.println(c);

    }
}
class division{
    public static void main(String[] args){
        double r = 12.333;
        double k = 12222.89;
        double division = k/r;
        System.out.println(division);
    }
}
class trueFalse{
    public static void main(String[] args){
        boolean maazIsKing = false;
        System.out.println(maazIsKing);
    }
}

class dataType{
    public static void main(String[] args){
        byte m = 111;
        int h = 12;
        float k = 12.3f;
        double g= 12.45;
        String r = "Maaz Khan";
        boolean why = true;
        System.out.println(m);
        System.out.println(h);
        System.out.println(k);
        System.out.println(g);
        System.out.println(r);
        System.out.println(why);

    }
}
class operatorsAndCondition{
    public static void main(String[] args){
        int a = 10;
        int b = 30;
        int c = 50;
        if(a<b && a<c){
            System.out.println(a + b);
        }
        else if(b>a && b>c){
           System.out.println(b + c);
        }
        else{
            System.out.println(a + b + c);
        }
    }

}
class input{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int input = scan.nextInt();
        System.out.println(input);
    }
}
class string{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = scan.nextLine();
        System.out.println("Enter the Name:");
        String job = scan.nextLine();
        System.out.println(job);
        System.out.println(name + " He is a " + job);
        System.out.println(name.length() + " He is a " + job.length());
        System.out.println(name.toUpperCase() + " He is a " + job.toLowerCase());
        System.out.println(name.contains("az"));
        System.out.println(name.endsWith("an"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("aa"));
    }
}
class math{
    public static void main(String[] args){
        int num1 = 5, num2 = 7;
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.abs(-num1));
        System.out.println(1 + (8 - 1) * Math.random());
    }
}
class condition{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = scan.nextInt();
        if(age < 18){
            System.out.println("Not Egligble for voting\n");
        }
        else{
            System.out.println("Egligble for Voting");
        }
        switch(age){
            case 18:
            System.out.println("Adult");
            break;
            case 17:
            System.out.println("Teenage");
            break;
            case 25:
            System.out.println("Men");
            default:
            System.out.println("18 for Adult 17 for teenage and 25 for men Enter again");
        }

    }
}
class quiz{
    public static void main(String[] args){
        System.out.print("Enter the Number on  the base of days in week:");
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        switch(days){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wensday");
            break;
            case 5:
            System.out.println("Thusrday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Suaterday");
            break;
            default:
            System.out.println("Enter the right input");
            break;
        }

    }
}
class loop{
    public static void main(String[] args){
        System.out.println("Enter the term: ");
        Scanner scan = new Scanner(System.in);
        int fact = 1;
        int num = scan.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.println(fact*=i);
        }
        int i = 1;
        while(i<10){
            System.out.println(i+=i);
        }
        int k = 1;
        do{
            System.out.println(k+=k);
        }while(k<=10);
    }
}
class array{
    public static void main(String[] args){
        int [] marks ={1,2,3,4,5};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    
        for(int i = 0; i<marks.length; i++){
            System.out.print(i);
        }
    }
}
class _2dArray{
     public static void main(String args[]){
        int [][] marks = {{23,4,5},{3,4,5}};
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println("\n");

        }
     }
}
class StringArray{
    public static void main(String args[]){
        String [] name = {"Maaz", "Fawad", "Insha", "Harim"};
        //for each loop
        for(String value:name){
            System.out.println(value);
        }
    }
}
class tryCach{
    public static void main(String args[]){
        String [] name = {"Maaz","Fawad","Sudais","Farukh"};
        try{
            System.out.println(name[4]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("King as King");
    }
}
class method{
    static int sum(int i, int x){
        return i + x;
    }
    public static void main(String args[]){
        int a = 5, b = 7;
        System.out.println(sum(a, b));
    }
}
class calculator{
    static float sum(float a, float b){
        return a + b;
    }
    static float product(float a, float b){
        return a * b;
    }
    static float division(float a, float b){
        return a/b;
    }
    static float sub(float a, float b){
        return a - b;
    }
    public static void main(String args[]){
        while(true){
            System.out.print("Enter the NUmber: ");
            Scanner scan = new Scanner(System.in);
            float a = scan.nextFloat();
            System.out.print("Enter the operator: ");
            Scanner scan2 = new Scanner(System.in);
            char op = scan2.next().charAt(0);
            Scanner scan3 = new Scanner(System.in);
            System.out.print("Enter the number: ");
            float b = scan3.nextFloat();
            switch(op){
                case '+':
                System.out.println(sum(a,b));
                break;
                case '-':
                System.out.println(sub(a,b));
                break;
                case '*':
                System.out.println(product(a,b));
                break;
                case '/':
                System.out.println(division(a,b));
                break;
                default:
                System.out.println("Enter the wrong iput");
                break;
            }
            System.out.println("You want to continue Click Y, If not Click N");
            Scanner scan4 = new Scanner(System.in);
            char choice = scan4.next().charAt(0);
            if(choice == 'N' || choice == 'n'){
                break;
            }

        }
    }

}