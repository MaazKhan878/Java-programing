package modifier;
class Account{
    // Public access by any class
    public String name;
    // Protected access by sub classes
    protected String email;
    // Private no one access except from his class
    private String password;
    // to Access the private we use getters and setters concept
    // making function/method
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;

    }
}

public class modifiered {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Maaz Khan";
        account1.email = "mkhan0348810@gmail.com";
        account1.setPassword("maaz_01");
        System.out.println(account1.getPassword());
    }
    
}
