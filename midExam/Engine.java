package midExam;
public class Engine {
    int x = 3;
    public void print(){
        System.out.println("Harn Harn Harn"+x);
    }
    
}
class Car{
    Engine eng;
    Car(Engine e){
        eng = e;
    }
    public void print(){
        eng.x = 10;
        eng.print();
    }
}
class Engm{
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e);
        c.print();
        e.print();
    }
}
