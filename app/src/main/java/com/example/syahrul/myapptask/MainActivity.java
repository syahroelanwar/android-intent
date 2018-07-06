package com.example.syahrul.myapptask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton rbLk, rbPr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtNim = (EditText) findViewById(R.id.t_Nim);
        final EditText txtNama = (EditText) findViewById(R.id.t_Nama);
        final EditText txtAlmt = (EditText) findViewById(R.id.t_Almt);
        final EditText txtTelp = (EditText) findViewById(R.id.t_Telp);
        final EditText txtEmail = (EditText) findViewById(R.id.t_Email);
        rbLk = (RadioButton) findViewById(R.id.lk);
        rbPr = (RadioButton) findViewById(R.id.pr);
        Button sData = (Button) findViewById(R.id.btn_Send);

        sData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubMainActivity.class);
                intent.putExtra("dNim", txtNim.getText().toString());
                intent.putExtra("dNama", txtNama.getText().toString());
                String dJk = "";
                if (rbLk.isChecked()) {
                    intent.putExtra("dJk", rbLk.getText().toString());
                }else if(rbPr.isChecked()){
                    intent.putExtra("dJk", rbPr.getText().toString());
                }else{
                    intent.putExtra("dJk", dJk);
                    intent.putExtra("dJk", dJk);
                }
                intent.putExtra("dAlmt", txtAlmt.getText().toString());
                intent.putExtra("dTelp", txtTelp.getText().toString());
                intent.putExtra("dEmail", txtEmail.getText().toString());
                startActivity(intent);
            }
        });
    }
}
