package com.example.syahrul.myapptask;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;

public class SubMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);
        TextView vNim = (TextView) findViewById(R.id.vw_Nim);
        TextView vNama = (TextView) findViewById(R.id.vw_Nama);
        TextView vJk = (TextView) findViewById(R.id.vw_Jk);
        TextView vAlmt = (TextView) findViewById(R.id.vw_Almt);
        TextView vTelp = (TextView) findViewById(R.id.vw_Telp);
        TextView vEmail = (TextView) findViewById(R.id.vw_Email);

        vNim.setText(getIntent().getStringExtra("dNim"));
        vNama.setText(getIntent().getStringExtra("dNama"));
        vJk.setText(getIntent().getStringExtra("dJk"));
        vAlmt.setText(getIntent().getStringExtra("dAlmt"));
        vTelp.setText(getIntent().getStringExtra("dTelp"));
        vEmail.setText(getIntent().getStringExtra("dEmail"));

        Button btBack = (Button) findViewById(R.id.btn_Back);
        btBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubMainActivity.this, MainActivity.class));
                finish();
            }
        });
        Button btExit = (Button) findViewById(R.id.btn_Exit);
        btExit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
