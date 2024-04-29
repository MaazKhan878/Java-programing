package practicePractice;

public class TraficLight {
    private String light;
    private int duration;
    TraficLight(String light, int duration){
        this.light = light;
        this.duration = duration;
    }
    public void changeColor(String color){
        this.light = color;
    }
    public boolean isRed(){
        return light.equals("red");
    }
    public boolean isGreen(){
        return light.equals("green");
    }
    public void setDuration(int du){
        this.duration = du;
    }
    public int getDuration(){
        return this.duration;
    }
    
}
class Aftab{
    String name;
    String privacy;
    String business;
    int age;
    double money;
    Aftab(String name, String pri, String bus, int age, double money){
        this.name = name;
        this.privacy = pri;
        this.business = bus;
        this.age = age;
        this.money = money;
    }
    public void aftabInfo(){
        System.out.println("Name: "+name+"\nPrivacy: "+privacy+"\nBusiness: "+business+"\nAge: "+age+"\nMoney: "+money);
    }
}
class operate{
    public static void main(String args[]){
        TraficLight tr = new TraficLight("red", 30);
        System.out.println("Light color as Red: "+tr.isRed());
        System.out.println("Light color as Green: "+tr.isGreen());
        System.out.println("Duration time: "+tr.getDuration());
        tr.changeColor("green");
        System.out.println("__________________________________");
        System.out.println("Light color as Red: "+tr.isRed());
        System.out.println("Light color as Green: "+tr.isGreen());
        tr.setDuration(20);
        System.out.println("Duration time: "+tr.getDuration());
        Aftab af = new Aftab("Aftab Khan","Wifi password","Cars business", 25, 120000000.0);
        af.aftabInfo();
        Aftab af1 = new Aftab("Maaz Khan","Hostle Money","Technalogy", 22, 120000000000.0);
        af1.aftabInfo();

    }
}
