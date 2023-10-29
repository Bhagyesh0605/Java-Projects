public class Moneytransaction {
    private double balance;
    private String name;
    public Moneytransaction(String name){
        this.name=name;
        balance =0.0;
    }
    public double getbalance(){
        return balance;
    }
    public String getname(){
        return name;
    }
    public void deposite (double amount){
        balance +=amount;
        System.out.println(name+ " has $ " + balance + " in his account ");
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(name+ " has $ "+ balance);
        }
        else{
            System.out.println("Withdraws by " +name + "Fails");
        }


    }
    public void transefer(double amount , Moneytransaction acc){
        if (this.balance<amount){
            System.out.println("Transfer Fails");
        }
        else{
            this.balance -=amount;
            acc.balance+=amount;
            System.out.println("Account of "+ this.name + " becomes $" + this.balance);
            System.out.println("Account of "+ acc.name + " becomes $" + acc.balance);
        }
    }
    
}
