package com.badsolidprinciple.badSolidPrinciplesApp;

public class BankService implements BankFeatures {
    public Object sendOTP;

    //violation of SRP
    @Override
    public long deposit(long amount, String accounts){
        System.out.println("deposit method called");
        return 0;
    }

    @Override
    public long withdraw(long amount,String accounts){
        System.out.println("withdraw method called");
        return 0;
    }

    @Override
    public void printPassbook(){
        System.out.println("printPassbook method is called");
    }

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

    //violation of OCP

    public void sendNotifications(boolean OTP, String medium){
        if(OTP){
            System.out.println("OTP notification required");
        }
        else{
            if(medium.equals("email")){
                System.out.println("notifications sent to email");
            }
            if(medium.equals("phone")){
                System.out.println("notifications sent to phone number");
            }
        }
    }

    //violation of LSP

    @Override
    public void netBanking() {
        //empty
    }

    //violation of ISP in bank features interface
    //violation of DIP
    private DebitCard debitCard;

    public BankService(DebitCard debitCard){

        this.debitCard= debitCard;
    }
    /*private CreditCard creditCard;
    public BankService(CreditCard creditCard){
        this.creditCard= creditCard;
    }*/

    public void purchase(long amount){

        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        /*CreditCard creditCard= new CreditCard();
        BankService bs= new BankService(creditCard);*/

        DebitCard debitCard= new DebitCard();
        BankService bs= new BankService(debitCard);

        bs.purchase(5000);
        bs.deposit(5000,"savings account");
        bs.deposit(5000,"savings account");
        bs.netBanking();
        bs.printPassbook();
        bs.getLoanInterest("car");
        bs.sendNotifications(true,null);
        bs.sendNotifications(false,"email");
    }

    public void ppurchase(int i) {
    }
}
