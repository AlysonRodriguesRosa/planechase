package com.example.openstack.magic;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pinata extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinata);

        setTitle("Piñata Game");

        TextView textView = findViewById(R.id.pinata_life);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String pinata_life;
        // If there is a game running, get the previous life else starts in 30
        if(intent.hasExtra("pinata_life"))
            pinata_life = intent.getStringExtra("pinata_life");
        else
            pinata_life = String.valueOf(30);

        textView.setText(pinata_life);

        // Prize button is invisible until someone hits the piñata
        Button prize_button = findViewById(R.id.roll_prize);
        prize_button.setAlpha(.5f);
        prize_button.setClickable(false);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit this game", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    public void decrease_life(View view){
        TextView textView = findViewById(R.id.pinata_life);
        int life = Integer.parseInt(textView.getText().toString());
        if(life > 0) {
            life = life - 1;
            textView.setText(String.valueOf(life));

            Button prize_button = findViewById(R.id.roll_prize);
            prize_button.setAlpha(1f);
            prize_button.setClickable(true);
        } else {
            Toast.makeText(this, "Piñata is already dead. You won!", Toast.LENGTH_SHORT).show();
        }
    }

    public void increase_life(View view){
        TextView textView = findViewById(R.id.pinata_life);
        int life = Integer.parseInt(textView.getText().toString());
        life = life + 1;
        textView.setText(String.valueOf(life));
    }

    // Action for button "ROLL PRIZE"
    public void pinata_prize(View view){
        int min = 1; // inclusive
        int max = 13; // exclusive

        Random rand = new Random();
        int randomNum = rand.nextInt((max - min)) + min;

        finish();
        Intent intent = new Intent(this, Pinata_Prize.class);
        TextView textView = findViewById(R.id.pinata_life);
        String life_backup = textView.getText().toString();
        intent.putExtra("pinata_life", life_backup);
        intent.putExtra("random_number", randomNum);
        startActivity(intent);
    }
}
