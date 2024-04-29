package labtask;
class Time{
    int second;
    int minute;
    int houre;
    Time(int houre, int min, int sec){
        this.second = sec;
        this.minute = min;
        this.houre = houre;
    }
    public void addTime(int houre, int min, int sec){
        this.second += sec;
        this.minute += min;
        this.houre += houre;
        if(this.second>=60){
            this.second -= 60;
            this.minute++;
        }
        if(this.minute >= 60){
            this.minute -= 60;
            this.houre++;
        }
        if(this.houre >=24){
            this.houre -= 24;
        }
    }
    public void display(){
        System.out.println(houre+":"+minute+":"+second);
    }
}
public class TimeMain {
    public static void main(String args[]){
        Time t = new Time(12,34,15);
        t.addTime(23, 40, 20);
        t.display();
    }
    
}
