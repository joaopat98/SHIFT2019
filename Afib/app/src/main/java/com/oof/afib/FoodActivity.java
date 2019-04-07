package com.oof.afib;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool10 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_screen);

        final LinearLayout ll1 =  findViewById(R.id.alface);
        ll1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final TextView tv = findViewById(R.id.alface_texto);
                if(bool1){
                    bool1 = false;
                    ll1.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool1 = true;
                    ll1.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });

        final LinearLayout ll2 =  findViewById(R.id.brocolos);
        ll2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final TextView tv = findViewById(R.id.brocolos_texto);
                if(bool2){
                    bool2 = false;
                    ll2.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool2 = true;
                    ll2.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });

        final LinearLayout ll3 =  findViewById(R.id.couve_bruxelas);
        ll3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.couve_bruxelas_texto);
                if(bool3){
                    bool3 = false;
                    ll3.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool3 = true;
                    ll3.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });
        final LinearLayout ll4 =  findViewById(R.id.couve_galega);
        ll4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.couve_galega_texto);
                if(bool4){
                    bool4 = false;
                    ll4.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool4 = true;
                    ll4.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });

        final LinearLayout ll5 =  findViewById(R.id.couve_tronchuda);
        ll5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.couve_tronchuda_texto);
                if(bool5){
                    bool5 = false;
                    ll5.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool5 = true;
                    ll5.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });
        final LinearLayout ll6 =  findViewById(R.id.espargos);
        ll6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.espargos_texto);
                if(bool6){
                    bool6 = false;
                    ll6.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool6 = true;
                    ll6.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }

        });
        final LinearLayout ll7 =  findViewById(R.id.espinafres);
        ll7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.espinafres_texto);
                if(bool7){
                    bool7 = false;
                    ll7.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool7 = true;
                    ll7.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });
        final LinearLayout ll8 =  findViewById(R.id.salsa);
        ll8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.salsa_texto);
                if(bool8){
                    bool8 = false;
                    ll8.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool8 = true;
                    ll8.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });

        final LinearLayout ll9 =  findViewById(R.id.abacate);
        ll9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.abacate_texto);
                if(bool9){
                    bool9 = false;
                    ll9.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool9 = true;
                    ll9.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });

        final LinearLayout ll10 =  findViewById(R.id.alcool);
        ll10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView tv = findViewById(R.id.alcool_texto);
                if(bool10){
                    bool10 = false;
                    ll10.setBackgroundResource(R.drawable.alimentos);
                    tv.setTextColor(Color.BLACK);

                }
                else{
                    bool10 = true;
                    ll10.setBackgroundResource(R.drawable.fundo_alimentos);

                    tv.setTextColor(Color.WHITE);
                }

            }
        });

        ImageButton ib = findViewById(R.id.submeter);
        ib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(FoodActivity.this, MainActivity.class);
                FoodActivity.this.startActivity(i);
            }
        });

    }


}
