package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog dlg1;            // 방 만들기
    Button btnDlgEvent;     //dialog_layout11

    Dialog dlg2;            // 빠른시작
    TextView tvResult;      //결과창
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);

        dlg1 = new Dialog( this);
        dlg1.setContentView(R.layout.dialog_layout11);

        btnDlgEvent = dlg1.findViewById(R.id.btnDlgEvent);


        btnDlgEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }


            public void showDialog1(View v) {
                dlg1.show();
            }
        });
        dlg1.setOwnerActivity(MainActivity.this);
        dlg1.setCanceledOnTouchOutside(true);


    }
}
