package fileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class storeData {
    public static void main(String[] args) {
         File myfile = new File("fileHandling/DtatStore.txt");
         try {
            myfile.createNewFile();
         } catch (Exception e) {
            System.out.println(e);
         }
        try{ FileWriter fw = new FileWriter("fileHandling/DtatStore.txt");
            fw.write("Maaz the programmar");
            fw.close();
        }    
        catch(Exception e){
            System.out.println(e);
        }
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println();
        }
        
        if(myfile.delete()){
            System.out.println("i have delete my file "+myfile.getName());
        }
        else{
            System.out.println("ERROR");
        }
    }
    
}
