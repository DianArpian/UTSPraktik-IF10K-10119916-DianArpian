package com.example.utspraktik_if10k_10119916_dianarpian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tx_nik, tx_nama, tx_tgl_lahir, tx_jk, tx_hubungan,tx_tgl_konfirmasi, tx_jnstes;
    Button btn_ubah, btn_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tx_tgl_konfirmasi=(TextView)findViewById(R.id.txt_tgl_konfirmasi);
        tx_jnstes=(TextView)findViewById(R.id.txt_jnstes);
        tx_nik=(TextView)findViewById(R.id.tx_nik);
        tx_nama=(TextView)findViewById(R.id.tx_nama);
        tx_tgl_lahir=(TextView)findViewById(R.id.tx_tgl_lahir);
        tx_jk=(TextView)findViewById(R.id.tx_jkelamin);
        tx_hubungan=(TextView)findViewById(R.id.tx_Hubungan);

        Intent i = getIntent();
        tx_jnstes.setText(i.getExtras().getString("Jenis Tes"));
        tx_tgl_konfirmasi.setText(i.getExtras().getString("Tanggal Terkonfirmasi"));
        tx_nik.setText(i.getExtras().getString("Nik"));
        tx_nik.setText(i.getExtras().getString("Nik"));
        tx_nama.setText(i.getExtras().getString("Nama"));
        tx_tgl_lahir.setText(i.getExtras().getString("Tgl_lahir"));
        tx_jk.setText(i.getExtras().getString("Jk"));
        tx_hubungan.setText(i.getExtras().getString("Hub"));


        btn_lanjut=(Button)findViewById(R.id.lanjut);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(MainActivity2.this, "Terima kasih laporan anda membantu kami dalam melakukan penangan kasus secara tepat");
            }
        });

        btn_ubah=(Button)findViewById(R.id.ubah);
        btn_ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
