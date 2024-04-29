package Basic;
class GarbageColl{
    public void finalize(){
        System.out.println("JVM called the Garbage Collector");
    }
    public static void main(String args[]){
        GarbageColl gc1 = new GarbageColl();
        GarbageColl gc2 = new GarbageColl();
    
        gc1 = null;
        gc2 = null;
        System.gc();
    }
    
}
