package com.example.a10119241latihan3;

import static com.example.a10119241latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

//Pengerjaan : 25-26 April 2022
//Nim : 10119241
//Nama : Ahmad Fahmi Fahlevi
//Kelas : IF6
public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mendeklarasikan butterknife di activity
        ButterKnife.bind(this);

        // logika untuk menampung nilai putekstra dari kelas DoneActivity,
        // agar ketika dihalaman akhir (DoneActivity) ditekan button ok,
        // Semua activity dapat tertutup juga (finish).
        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}