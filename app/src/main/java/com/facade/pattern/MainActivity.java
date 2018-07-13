package com.facade.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.facade.pattern.facade.BankOperationFacade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BankOperationFacade bankOperationFacade=new BankOperationFacade();
        int accountNumber=bankOperationFacade.createNewUserAccount("Facade","savings");
        Log.e("","Customer account number generated!!");

        float moneyReceived=bankOperationFacade.withDrawMoney(4,12312124);
        Log.e("","Customer received 4$");

    }
}
