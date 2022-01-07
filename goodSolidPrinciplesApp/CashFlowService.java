package goodSOLID.goodSolidPrinciplesApp;

//LSP
public class CashFlowService implements netBanking{

    public CashFlowService(){//constructor
        }

    public long deposit(long amount, String accounts){
        System.out.println("deposit method called");
        return 0;
    }
    public long withdraw(long amount,String accounts){
        System.out.println("withdraw method called");
        return 0;
    }

    @Override
    public void netBankingSystem() {
        System.out.println("Net Banking feature activated");
    }
}
