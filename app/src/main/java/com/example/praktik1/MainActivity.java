package com.example.praktik1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnfragment1;
    private Button btnfragment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment1 = findViewById(R.id.btn_frag1);
        btnfragment2 = findViewById(R.id.btn_frag2);

        btnfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ubahfragment(new fragment1());
            }
        });

        btnfragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ubahfragment(new Fragment2());
            }
        });
    }

    private void ubahfragment (Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.Fragment_continer,fragment);
        transaction.commit();
    }
}