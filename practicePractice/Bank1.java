package practicePractice;
import java.util.ArrayList;
public class Bank1 {
    static class Account{
        private String name;
        private String pswd;
        private double balance;
        public Account(String name, String pswd, double balance){
            this.name = name;
            this.pswd = pswd;
            this.balance = balance;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setPswd(String pswd){
            this.pswd = pswd;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public String getName(){
            return this.name;
        }
        public String getPswd(){
            return this.pswd;
        }
        public double getBalance(){
            return this.balance;
        }
        public void addMoney(double money){
            this.balance += money;
        }
        public void withdraw(double money){
            this.balance -= money;
        }
        public String getInfo(){
            return "Name: "+name+", Password: "+pswd+", Balance: "+balance;
        }
    }
    static class Bankop{
        private ArrayList<Account> accounts;
        public Bankop(){
            accounts = new ArrayList<>();
        }
        public void addAccount(Account account){
            accounts.add(account);

        }
        public void removeAccount(Account account){
            accounts.remove(account);
        }
        public void deposite(Account account, double money){
            account.addMoney(money);
        }
        public void withdrawMoney(Account account, double money){
            account.withdraw(money);
        }
        public ArrayList<Account> getAccount(){
            return accounts;

        }
        
    }
    public static void main(String args[]){
        Account account1 = new Account("Maaz Khan", "123rt", 2000);
        Account account2 = new Account("Fawad Khan", "23rt", 2567);
        // System.out.println(account1.getInfo());
        Bankop ba = new Bankop();
        ba.addAccount(account1);
        ba.addAccount(account2);
        ba.removeAccount(account1);
        for(Account ac: ba.getAccount()){
            System.out.println(ac.getInfo());
        }


    }
    
}
