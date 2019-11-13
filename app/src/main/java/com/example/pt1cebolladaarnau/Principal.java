package com.example.pt1cebolladaarnau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Super comentario
    public void onClickHelp(View view){


        Intent intent= new Intent(this, Ajuda.class);


        startActivity(intent);

    }
}
