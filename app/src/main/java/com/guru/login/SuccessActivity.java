package com.guru.login;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class SuccessActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Button btn_su = (Button)findViewById(R.id.btn_suggest);
        Button btn_li = (Button)findViewById(R.id.btn_list);
        Button btn_se = (Button)findViewById(R.id.btn_search);
        Button btn_us = (Button)findViewById(R.id.btn_user);
        Button btn_in = (Button)findViewById(R.id.btn_info);
        Button btn_tb = (Button)findViewById(R.id.btn_turnback);
        Button btn_fu = (Button)findViewById(R.id.btn_function);



        btn_su.setOnClickListener(new View.OnClickListener() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentOne f1 = new FragmentOne();
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,f1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        btn_se.setOnClickListener(new View.OnClickListener() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTwo f2 = new FragmentTwo();
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,f2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}
