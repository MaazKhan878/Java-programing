package tested;
class productTag{
    String name;
    String id;
    public void showInfo(){
        System.out.println("Name"+this.name);
        System.out.println("Id: "+this.id);
    }
    productTag(productTag pT){
        this.name =pT.name;
        this.id = pT.id;
        pT.showInfo();
    }
    productTag(){}
}
public class Product {
    public static void main(String args[]){
        productTag ptag = new productTag();
        ptag.name = "Maaz Khan";
        ptag.id = "109";
        productTag nTag = new productTag(ptag);
        nTag.id = "103";
        nTag.name = "Fawad Khan";
        ptag.showInfo();
        System.out.println("New one");
        nTag.showInfo();
    }
}

