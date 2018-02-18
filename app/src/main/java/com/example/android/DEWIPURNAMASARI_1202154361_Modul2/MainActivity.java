package com.example.android.DEWIPURNAMASARI_1202154361_Modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "DEWI PURNAMA SARI_1202154361",Toast.LENGTH_SHORT).show();
    }


    public void onClickOrder(View view) {
        // pilihan ketika mengklik button
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Dine In atau Take Away?",Toast.LENGTH_SHORT).show();
        }
    }
}
