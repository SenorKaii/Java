public class Account{
    private String name;
    private int ID;
    private double balance;
    
    public Account(){
        name = null;
        ID = 0;
        balance = 0;
    }
    public Account(String name, int ID, double balance){
        name = name;
        ID = ID;
        balance = balance;
    }
    public Account(Account oldAcc){
        name = oldAcc.name;
        ID = oldAcc.ID;
        balance = oldAcc.balance;
    }
    public void setAccount(String x, int y, double z){
        name = x;
        ID = y;
        balance = z;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public double getBalance(){
        return balance;
    }
    public void calculateNewBalance(double withdrawal){
        double newBalance;
        newBalance = balance - withdrawal;
        System.out.println ("Your new balance is: " + newBalance);
    }
    public String toString(){
        return ("Name: " + name + "ID: " + ID + "Balance: " + balance);
    }
}
