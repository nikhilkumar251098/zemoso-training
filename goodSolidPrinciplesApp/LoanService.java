package goodSOLID.goodSolidPrinciplesApp;

//SRP
public class LoanService {
    public void getLoanInterest(String loanType){
        if(loanType.equals("homeLoan")){
            System.out.println("you chose home loan under getLoanInterest");
        }
        if(loanType.equals("personalLoan")){
            System.out.println("you chose personal loan under getLoanInterest");
        }
        if(loanType.equals("car")){
            System.out.println("you chose car loan under getLoanInterest");
        }
    }
}
