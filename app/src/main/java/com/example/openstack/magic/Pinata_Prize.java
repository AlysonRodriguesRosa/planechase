package com.example.openstack.magic;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class Pinata_Prize extends FragmentActivity {
    protected static String pinata_life = "";
    protected static int random_number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove a title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_pinata__prize);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        pinata_life = intent.getStringExtra("pinata_life");
        random_number = intent.getIntExtra("random_number", 1);

        choose_token(random_number);
    }

    public void ok_button(View view){
        finish();
        Intent intent = new Intent(this, Pinata.class);
        intent.putExtra("pinata_life", pinata_life);
        startActivity(intent);
    }

    protected void choose_token(int number){
        // Get Image token field
        ImageView img = findViewById(R.id.token_image);
        switch (number) {
            case 1:
                img.setImageResource(R.drawable.blue_token);
                break;
            case 2:
                img.setImageResource(R.drawable.white_token);
                break;
            case 3:
                img.setImageResource(R.drawable.red_token);
                break;
            case 4:
                img.setImageResource(R.drawable.black_token);
                break;
            case 5:
                img.setImageResource(R.drawable.green_token);
                break;
            case 6:
                img.setImageResource(R.drawable.colorless_token);
                break;
            case 7:
                img.setImageResource(R.drawable.blue2_token);
                break;
            case 8:
                img.setImageResource(R.drawable.white2_token);
                break;
            case 9:
                img.setImageResource(R.drawable.red2_token);
                break;
            case 10:
                img.setImageResource(R.drawable.black2_token);
                break;
            case 11:
                img.setImageResource(R.drawable.green2_token);
                break;
            case 12:
                img.setImageResource(R.drawable.colorless2_token);
                break;

        }
    }
}
