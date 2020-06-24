package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.ui.login.doglogin;

public class MainActivity2 extends AppCompatActivity {
    Button dogbtn;
    Button catbtn;
    Button yesbtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dogbtn=(Button)findViewById(R.id.dogbtn);
        dogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this, doglogin.class);
                startActivity(i);
            }
        });

//        catbtn=(Button)findViewById(R.id.catbtn);
//        catbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent x=new Intent(MainActivity2.this,cat.class);
//                startActivity(x);
//            }
//        });
//
//        yesbtn=(Button)findViewById(R.id.yesbtn);
//        yesbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent y=new Intent(MainActivity2.this,vet.class);
//                startActivity(y);
//
//
//
//            }
//        });
    }
}
