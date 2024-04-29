package practicePractice;
import java.util.ArrayList;
public class Bank {
    class Accounts{
        private String name;
        private String pswd;
        private double balance;
        public Accounts(String name, String pswd, double balance){
            this.name = name;
            this.pswd = pswd;
            this.balance= balance;
        }
        // public void setName(String name){
        //     this.name = name;
        // }
        // public void setPswd(String pswd){
        //     this.pswd = pswd;
        // }
        // public void setDeposite(double amount){
        //     this.balance = amount;
        // }
       
        // public String getName(){
        //     return this.name;
        // }
        // public String getPswd(){
        //     return this.pswd;
        // }
        // public double getDeposite(){
        //     return this.balance;
        // }
        public void depositeMoney(double amount){
            this.balance += amount;
        }
        public void withdrawMoney(double amount){
            this.balance -= amount;
        }
       
        public String getAccountinfo(){
            return "Name: "+name+", Password: "+pswd+", Balance: "+balance;
        }
    }
    static class Operation{
        private ArrayList<Accounts> accounts;
        public Operation(){
            accounts = new ArrayList<Accounts>();
        }
        public void addAccount(Accounts account){
            accounts.add(account);
        }
        public void removeAccount(Accounts account){
            accounts.remove(account);
        }
        public void addMoney(Accounts account, float money){
            account.depositeMoney(money);
        }
        public void withdraw(Accounts account , float money){
            account.withdrawMoney(money);
        }
        public ArrayList<Accounts> getAccounts(){
            return accounts;
        }

    }
    public static void main(String args[]){
        Operation op = new Operation();
        Bank bank = new Bank();
        Accounts account1 = bank.new Accounts("maaz khan", "123", 2334.9);
        op.addAccount(account1);
        op.addMoney(account1, 20000);
        String info = account1.getAccountinfo();
        System.out.println(info);
        op.addMoney(account1, 5678788);
        op.withdraw(account1, 2000000);
        op.removeAccount(account1); 
        System.out.println(account1.getAccountinfo());

    }
    
}
