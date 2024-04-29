package Basic;
import java.util.Scanner;
class CalculatArea{
    float length;
    float width;
    public void setDim(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getArea(){
        return length * width;
    }
}
public class Area {
    public static void main(String args[]){
        float length, width;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length:");
        length = scanner.nextFloat();
        System.out.print("Enter the width:");
        width = scanner.nextFloat();
        scanner.close();
        CalculatArea cA = new CalculatArea();
        cA.setDim(length, width);
        System.out.println(cA.getArea());
    }
    
}
