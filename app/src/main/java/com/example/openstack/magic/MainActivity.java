package com.example.openstack.magic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected int language = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Magic: The Gathering");

        Intent intent = getIntent();
        if(intent.hasExtra("language"))
            language = intent.getIntExtra("language", 0);

        if(language == 0) {
            Button language_button = findViewById(R.id.language);
            language_button.setAlpha(.3f);
        }
    }

    public void PinataGame(View view){
        finish();
        Intent intent = new Intent(this, Pinata.class);
        startActivity(intent);
    }

    public void PlanechaseGame(View view){
        finish();
        Intent intent = new Intent(this, Planechase.class);
        intent.putExtra("language", language);
        startActivity(intent);
    }

    public void Set_Language(View view){
        Button language_button = findViewById(R.id.language);
        if(language == 0) {
            language_button.setAlpha(1f);
            language = 1; // 0 for english; 1 for portuguese
        } else {
            language_button.setAlpha(.3f);
            language = 0; // 0 for english; 1 for portuguese
        }
    }
}
