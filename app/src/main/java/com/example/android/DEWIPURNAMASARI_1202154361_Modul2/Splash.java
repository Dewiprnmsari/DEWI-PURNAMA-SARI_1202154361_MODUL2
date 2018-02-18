package com.example.android.DEWIPURNAMASARI_1202154361_Modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends Activity {

    //method yang dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() { //method untuk mengarahkan ke aktivitas selanjutnya
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }

        }, 3000L); //3000 L = 3 detik
    }

}
