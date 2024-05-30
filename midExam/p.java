package midExam;

class p {
    int pnum;
    int pnumber;
    int ppnumber;
    private int gh;
    p(){

    }
    public void print(){
        System.out.println("Outer class:"+(pnum+pnumber+ppnumber));
        
    }
    
    class d{
        
        private int kh;
        int number;
        int dd;
        public void print(){
            System.out.println("Inner class: "+(number+dd));
            System.out.println("private enclosed class: "+ gh);
        }
    }
    
}
class Con{
    Con(String g, String y, int k) {
        this(g, k);  // Calls the constructor Con(String, int)
        System.out.println(y);
    }

    // Default constructor
    Con() {
        System.out.println("Construct");
    }

    // Constructor with an int
    Con(int x) {
         // Initializing the instance variable x
        System.out.println(x);
    }

    // Constructor with a string and an int
    Con(String x, int y) {
        this(y);  // Calls the constructor Con(int)
        System.out.println(x);
    }
}

class Main{
    public static void bubbleSort(int x[]){
        for (int i = 0; i < x.length - 1; i++) {
            
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                    
                }
            }
        
    }   }

    public static void main(String[] args) {
        p p1 = new p();
        p.d d1 = p1.new d();
        
        d1.number = 10;
        d1.dd = 30;
        d1.print();
        p1.print();
        p[] b = new P[10];
        for(int i = 0; i<10; i++){
            b[i] = new P();
            b[i].pnum = i+1;
        }
        for(int i = 0; i<10; i++){
            b[i].print();
        }
        int x[] = {3,1,6,7,3};
        bubbleSort(x);
        for(int i:x){
            System.out.print(i+" ");
        }
        // try{
        //     Con c1 = new Con();
        //     Con c2 = new Con(34);
        //     Con c3 = new Con(null, 0)
        //     Con c = new Con("Maaz Khan","Fawad",34);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
    }
}
