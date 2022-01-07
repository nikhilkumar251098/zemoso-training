package goodSOLID.goodSolidPrinciplesApp;


public class BankServices {

    //DIP
    private BankCard bc;
    public BankServices(BankCard bc) {
        this.bc=bc;
    }

    //SRP
    public void checkBal(){
        bc.displayAmt(5000);

    }

    public static void main(String[] args) {

        CashFlowService csf= new CashFlowService();
        LoanService ls= new LoanService();
        PrinterService ps= new PrinterService();
        Notifications n= new Notifications();
        InstagramNotifications in= new InstagramNotifications();
        //BankCard bc= new DebitCard();
        BankCard bc= new CreditCard();
        BankServices bs= new BankServices(bc);

        csf.deposit(5000,"savings account");
        csf.withdraw(5000,"savings account");
        ps.printPassbook();
        ls.getLoanInterest("car");
        n.sendOTP("email");
        n.sendUpdates("email");
        in.sendAds();
        bs.checkBal();

    }
    //OCP in InstagramNotifications
    //LSP in Notifications
    //ISP in NotificationForAds
    //DIP in BankCard


}

