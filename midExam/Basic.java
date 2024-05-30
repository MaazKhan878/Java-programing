
package midExam;
import java.util.*;
class BookNames{
    private String bookNames[];
    BookNames(){
        bookNames = new String[6];
    }
    BookNames(String bookNames[]){
        this.bookNames = bookNames;
    }
    public void setBookNames(String bookNames[]){
        this.bookNames = new String[6];
        this.bookNames = bookNames;
    }
    public String[] getBookNames(){
        return bookNames;
    }
}
class User{
    private String userName;
    private String id;
    private double money;
    private double calculateMoney;
    BookNames b;
    User(){
        userName = null;
        id = null;
        money = 0.0;
        calculateMoney = 0.0;
        b = new BookNames();        
    }
    User(String userName, String id, double money, String bookNames[]){
        this.userName = userName;
        this.id = id;
        this.money = money;
        b = new BookNames(bookNames);

    } 
    public void setUserName(String name){
        this.userName = name;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setCalcu(double cal){
        this.calculateMoney = cal;
    }
    public double getMoney(){
        return money;
    }
    public String getUserName(){
        return userName;
    }
    public String getId(){
        return id;
    }
    public double getCalculated(){
        return calculateMoney;
    }
    public void calculationUserMoney(User u1, User u2){
        calculateMoney = u1.money + u2.money;
    }
    @Override
    public String toString(){
        return "User Name : "+userName+"\n User ID: "+id+"\n Money: "+money+"Calculation: "+calculateMoney;
    }
    public void PrintObjectsInfo(User u1, User u2, User u3){
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());
    }
    public void printBook(){
        for(String n: b.getBookNames()){
            System.out.println("Book Name: "+n);
        }
    }

}
class Array123D{
    int arry[];
    int arry2D[][];
    int c;
    int r;
    Array123D(int c , int r){
        this.c = c;
        this.r = r;
        arry = new int[c];
        arry2D = new int[c][r];
    }
    public void getArray(int arr[], int arrD2[][]){
        this.arry = arr;
        this.arry2D = arrD2;
    }
    public void printByFor(){
        for(int i = 0; i<arry.length; i++){
            System.out.print(arry[i]+" ");
        }
        System.out.println();
        for(int i = 0; i<c; i++){
            for(int j = 0; j<r; j++){
                System.out.print(arry2D[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void forEach(){
        for(int i: arry){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i[]:arry2D){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public String toString(){
        return Arrays.toString(arry);
    }
    public String d2String(){
        return Arrays.deepToString(arry2D);
    }
}
public class Basic {
    public static void main(String[] args) {
        User u1 = new User("Maaz Khan","Sp23-BSE-109",89.0,new String[]{"Opps","Ict", "Calculus"});
        User u2 = new User("Maaz  ali Khan","Sp23-BSE-209",1223.0,new String[]{"OOPs","Cal","Math","English"});
        User u3 = new User("Fawad Khan","Sp23-BSE-409",234.0,new String[]{"Urd","Arabi","English","OOPS","PAK-Study"});
        u3.calculationUserMoney(u1, u2);
        System.out.println(u3.getCalculated());
        u3.PrintObjectsInfo(u1, u2, u3);
        System.out.println("==========================");
        Array123D d = new Array123D(3,4);
        d.getArray(new int[]{1,2,3}, new int[][]{{0,9,7,5},{9,8,7,6},{5,6,7,8}});
        d.printByFor();
        System.out.println("+++++++++++++++++++++");
        d.forEach();
        System.out.println(d.toString());
        System.out.println(d.d2String());
        BookNames b = new BookNames(new String[]{"Opps","PF","ICT","Discrete","Management"});
        User u4 = new User("Maaz Khan","!09",1234.0,b.getBookNames());
        u4.printBook();
        System.out.println(Arrays.toString(b.getBookNames()));
        
        
    }
    
}
