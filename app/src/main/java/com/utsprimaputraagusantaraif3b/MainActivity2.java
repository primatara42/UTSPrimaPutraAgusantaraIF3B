package com.utsprimaputraagusantaraif3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    TextView tvnamaOutput, tvnomorPendaftaran, tvjalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnamaOutput = findViewById(R.id.tv_namaOutput);
        tvnomorPendaftaran = findViewById(R.id.tv_nomorPendaftaranOutput);
        tvjalurPendaftaran = findViewById(R.id.tv_jalurPendaftaranOutput);

        Intent terima= getIntent();
        String yNama =terima.getStringExtra("xNama");
        String yNomor = terima.getStringExtra("xNomor");
        String yJalur = terima.getStringExtra("xJalur");

        tvnamaOutput.setText(yNama);
        tvnomorPendaftaran.setText(yNomor);
        tvjalurPendaftaran.setText(yJalur);
    }
}