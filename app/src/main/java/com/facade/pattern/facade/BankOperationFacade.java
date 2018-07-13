package com.facade.pattern.facade;

import android.util.Log;

import com.facade.pattern.complex.OpenBankAccount;
import com.facade.pattern.complex.WithDrawMoney;

/**
 * BankOperationFacade is a facade interface that provides simplified interface for a bank operation
 */
public class BankOperationFacade {

    private OpenBankAccount openBankAccount;
    private WithDrawMoney withDrawMoney;

    public BankOperationFacade(){
        openBankAccount=new OpenBankAccount();
        withDrawMoney=new WithDrawMoney();
    }

    public int createNewUserAccount(String userName,String accountType){
       return openBankAccount.createAccount(userName,accountType);
    }

    public float withDrawMoney(float money, int accountNumber){

        return withDrawMoney.withDraw(money,accountNumber);
    }
}
