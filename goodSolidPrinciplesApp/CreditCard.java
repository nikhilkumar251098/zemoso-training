package goodSOLID.goodSolidPrinciplesApp;

//DIP
public class CreditCard implements BankCard{
    public void displayAmt(long amount) {
        System.out.println("displaying using credit card:"+ amount);
    }
}
