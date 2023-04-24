package com.tanishqtodkari.firebase_auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class d1 extends AppCompatActivity implements View.OnClickListener{
    private CardView D14,D11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);

        getSupportActionBar().setTitle("ClubConnect");
        D11=(CardView) findViewById(R.id.d11);
        D14=(CardView) findViewById(R.id.d14);
        D11.setOnClickListener((View.OnClickListener)this);
        D14.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public void onClick(View v){
        Intent i;
        switch ((v.getId())){
            case R.id.d11: i = new Intent(this,d11.class);startActivity(i);break;
            case R.id.d14: i = new Intent(this,d14.class);startActivity(i);break;

        }
    }
}