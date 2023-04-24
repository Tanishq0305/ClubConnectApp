package com.tanishqtodkari.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class d14 extends AppCompatActivity implements View.OnClickListener{

    private CardView D9,D8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d14);
        getSupportActionBar().setTitle("ENTC Department");
        getSupportActionBar().setTitle("ClubConnect");
        D9=(CardView) findViewById(R.id.d122);
        D8=(CardView) findViewById(R.id.d121);
        D9.setOnClickListener((View.OnClickListener)this);
        D8.setOnClickListener((View.OnClickListener)this);

    }
    @Override
    public void onClick(View v){
        Intent i;
        switch ((v.getId())){
            case R.id.d122: i = new Intent(this,d122.class);startActivity(i);break;

        }
    }
}