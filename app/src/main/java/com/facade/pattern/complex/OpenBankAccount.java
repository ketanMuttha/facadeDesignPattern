package com.facade.pattern.complex;

public class OpenBankAccount {

    String mCustomerName;

    String mCustomerAccountType;

    public OpenBankAccount(){

    }


    public int createAccount(String customerName, String accountType){
        int accountNumber=0;
        mCustomerName=customerName;
        mCustomerAccountType=accountType;


       // Customer data save in database

        //generate the account number.

        return accountNumber;
    }
}
