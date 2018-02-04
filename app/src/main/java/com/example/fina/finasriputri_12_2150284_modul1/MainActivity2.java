package com.example.fina.finasriputri_12_2150284_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView jumlah;
    TextView tempat;
    TextView menu;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String iJumlah = intent.getStringExtra("jumlah");
        String iTempat = intent.getStringExtra("tempat");
        String iMenu = intent.getStringExtra("menu");
        String iHarga = intent.getStringExtra("harga");
        int jmlHarga = Integer.valueOf(iHarga)*Integer.valueOf(iJumlah);

        jumlah= (TextView) findViewById(R.id.idJumlahPorsi);
        jumlah.setText(iJumlah);
        tempat= (TextView) findViewById(R.id.idTempat);
        tempat.setText(iTempat);
        menu= (TextView) findViewById(R.id.idMenu);
        menu.setText(iMenu);
        harga= (TextView) findViewById(R.id.idTotalharga);
        harga.setText(String.valueOf(iHarga));

        if (jmlHarga>65500){
            Toast toast = Toast.makeText(this, "Uang kamu tidak cukup untuk makan disini", Toast.LENGTH_LONG);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(this, "Kamu bisa makan malam disini", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
