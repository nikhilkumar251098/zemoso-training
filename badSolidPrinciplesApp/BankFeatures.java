package com.badsolidprinciple.badSolidPrinciplesApp;

//violation of ISP
public interface BankFeatures {
    void netBanking();

    long deposit(long amount, String accounts);

    long withdraw(long amount, String accounts);

    void printPassbook();
}
