public class driver {
    public static void main(String args[]){
        Moneytransaction Jay = new Moneytransaction("Jay");
        Jay.deposite(500.0);
        Moneytransaction Mery = new Moneytransaction("Mery");
        Mery.deposite(800.0);
        Jay.transefer(200.0, Mery);
        Mery.withdraw(350);
        System.out.println(Mery.getbalance());
    }
}
