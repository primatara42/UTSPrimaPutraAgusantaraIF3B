package com.utsprimaputraagusantaraif3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    //DEKLARASI OBJEK
    EditText etNama;
    EditText etnomorPendaftaran;
    Spinner spjalurPendaftaran;
    Button btDaftar;
    CheckBox konfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_namaLengkap);
        etnomorPendaftaran = findViewById(R.id.et_nomorPendaftaran);
        spjalurPendaftaran = findViewById(R.id.sp_jalurpendaftaran);
        btDaftar = findViewById(R.id.bt_daftar);
        konfirmasi = findViewById(R.id.cb_confirm);


        btDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String namaPeserta = etNama.getText().toString();
                String nomorPendaftaran = etnomorPendaftaran.getText().toString();

                String jalur = spjalurPendaftaran.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), jalur, Toast.LENGTH_LONG).show();

                if(namaPeserta.equals(""))
                {
                    etNama.setError("Nama Harus Diisi!");
                }

                else if(nomorPendaftaran.equals(""))
                {
                    etnomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi!");
                }

                else if(!konfirmasi.isChecked())
                {
                    Toast.makeText(getApplicationContext(), "Tombol Konfirmasi Harus Dicentang", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("xNama", namaPeserta);
                    pindah.putExtra("xNomor", nomorPendaftaran);
                    pindah.putExtra("xJalur", jalur);
                    startActivity(pindah);

                }


            }
        });

    }
}