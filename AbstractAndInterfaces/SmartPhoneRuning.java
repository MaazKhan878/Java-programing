package AbstractAndInterfaces;
interface Camera{
    void takePic();
    void numOfPic(int number);
}
interface CellPhone{
    void makeCall(int number);
    void recievedCall();
    void ignorCall();
}
interface VideoPlayer{
    void playVideo();
    void stopVideo();
}
class SmartPhone implements Camera,CellPhone,VideoPlayer{
    public void takePic(){
        System.out.println("Picture taking......");
    }
    public void numOfPic(int x){
        System.out.println("Number of pic taking "+x);
    }
    public void makeCall(int x){
        System.out.println("Call making to "+x);
    }
    public void recievedCall(){
        System.out.println("Call recieved");
    }
    public void ignorCall(){
        System.out.println("Ignor Call .....");
    }
    public void playVideo(){
        System.out.println("Video playing....");
    }
    public void stopVideo(){
        System.out.println("Video stoped.....");
    }

}
class smarter extends SmartPhone{

}
public class SmartPhoneRuning {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall(348);
        sp.playVideo();
        sp.takePic();
        Camera c = new SmartPhone();
        c.takePic();
        c.numOfPic(12);
        smarter s = new smarter();
        s.makeCall(123);
    }
    
}
