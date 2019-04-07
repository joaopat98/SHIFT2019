package com.oof.afib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NotificationScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_screen);
        ImageButton ib = findViewById(R.id.já_tomou);
        ib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(NotificationScreenActivity.this, FoodActivity.class);
                NotificationScreenActivity.this.startActivity(i);
            }
        });
    }
}
