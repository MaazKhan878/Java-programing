package Quiz;
class staticProgram{
    static class staticpr{
        static int x = 0;
        static float y;
        staticpr(int x, float y){
            this.x = x;
            this.y = y;
        }
        static void print(){
            System.out.println("X = "+x+" Y = "+y);
        }
    // }
    // public static void main(String args[]){
    //     staticpr.x = 12;
    //     staticpr.y = 12.0f;
    //     staticpr.print();
    // }
   }
}
class MainRun{
    public static void main(String args[]){
        staticProgram.staticpr.x = 12;
        staticProgram.staticpr.y = 1.0f;
        staticProgram.staticpr.print();


    }

}