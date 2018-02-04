package com.example.fina.finasriputri_12_2150284_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText jumlah;
EditText menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatbus(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        menu = (EditText) findViewById(R.id.Id_menu);
        String Menu = menu.getText().toString();
        jumlah = (EditText) findViewById(R.id.Id_jumlah);
        String jml = jumlah.getText().toString();
        intent.putExtra("tempat", "eatbus");
        intent.putExtra("menu", Menu);
        intent.putExtra("jumlah", jml);
        intent.putExtra("harga", "50000");
        startActivity(intent);
    }
    public void abnormal(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        menu = (EditText) findViewById(R.id.Id_menu);
        String Menu = menu.getText().toString();
        jumlah = (EditText) findViewById(R.id.Id_jumlah);
        String jml = jumlah.getText().toString();
        intent.putExtra("tempat", "abnormal");
        intent.putExtra("menu", Menu);
        intent.putExtra("jumlah", jml);
        intent.putExtra("harga", "30000");
        startActivity(intent);
    }
}

