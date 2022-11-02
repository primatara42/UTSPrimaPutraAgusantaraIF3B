package com.utsprimaputraagusantaraif3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    //DEKLARASI OBJEK
    EditText etNama;
    EditText nomorPendaftaran;
    Spinner spjalurPendaftaran;
    Button btDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_namaLengkap);
        nomorPendaftaran = findViewById(R.id.et_nomorPendaftaran);
        spjalurPendaftaran = findViewById(R.id.sp_jalurpendaftaran);
        btDaftar = findViewById(R.id.bt_daftar);

        btDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String jalur = spjalurPendaftaran.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), jalur, Toast.LENGTH_LONG).show();
            }
        });

    }
}