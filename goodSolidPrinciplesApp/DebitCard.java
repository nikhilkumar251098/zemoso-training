package goodSOLID.goodSolidPrinciplesApp;

//DIP
public class DebitCard implements BankCard{
    public void displayAmt(long amount) {
        System.out.println("displaying using debit card: "+ amount);
    }
}
