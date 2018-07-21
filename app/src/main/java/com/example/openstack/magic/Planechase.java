package com.example.openstack.magic;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Planechase extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    protected int chaos = 0;
    protected int planeswalk = 0;
    protected int current_plane_position = 0;
    protected int language = 0;

    protected ArrayList<Integer> plane_list = new ArrayList<>();

    int number_of_planes = 39; // exclusive

    // Starts or recover the plane
    Planes_db db = new Planes_db();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planechase);

        setTitle("Planechase");

        ImageView shine = findViewById(R.id.shine);
        shine.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();

        // get the language
        if(intent.hasExtra("language"))
            language = intent.getIntExtra("language", 0);

       // random list of planes
        if(intent.hasExtra("planes_random_list"))
            plane_list = intent.getIntegerArrayListExtra("planes_random_list");
        else {
            for(int i=0; i<number_of_planes; i++)
                plane_list.add(i);
            Collections.shuffle(plane_list);
        }

        // which is our plane position in list
        if(intent.hasExtra("current_plane_position"))
            current_plane_position = intent.getIntExtra("current_plane_position", 0);
        else
            current_plane_position = 0;

        if(intent.hasExtra("planeswalk"))
            planeswalk = intent.getIntExtra("planeswalk", 0);
        if(intent.hasExtra("chaos"))
            chaos = intent.getIntExtra("chaos", 0);

        ImageView chaos_image = findViewById(R.id.chaos_icon);
        TextView chaos_text = findViewById(R.id.chaos);

        if(chaos == 0) {
            chaos_image.setVisibility(View.INVISIBLE);
            chaos_text.setAlpha(.3f);
        } else {
            chaos_image.setVisibility(View.VISIBLE);
            chaos_text.setAlpha(1f);
        }

        Button roll_button = findViewById(R.id.roll_button);
        Button planeswalk_button = findViewById(R.id.planeswalk_button);
        if(planeswalk == 0){
            roll_button.setClickable(true);
            roll_button.setAlpha(1f);
            planeswalk_button.setClickable(false);
            planeswalk_button.setAlpha(.2f);
        } else {
            roll_button.setClickable(false);
            roll_button.setAlpha(.2f);
            planeswalk_button.setClickable(true);
            planeswalk_button.setAlpha(1f);
        }

        if(language == 0) // 0 for english
            db.load_english();
        else // 1 for portuguese
            db.load_portuguese();

        fill_plane_information();

        // special case
        TextView title_text = findViewById(R.id.plane_title);
        if(title_text.getText().toString().equals("Grand Ossuary - Ravnica") && chaos == 1){
            roll_button.setClickable(false);
            roll_button.setAlpha(.2f);
            planeswalk_button.setClickable(true);
            planeswalk_button.setAlpha(1f);
        }
    }

    public void roll_button(View view){
        finish();
        Intent intent = new Intent(this, Planechase_Roll.class);
        intent.putExtra("language", language);
        intent.putExtra("current_plane_position", current_plane_position);
        intent.putIntegerArrayListExtra("planes_random_list", plane_list);
        startActivity(intent);
    }

    public void randomize_plane(View view){
        current_plane_position++;
        if(current_plane_position == number_of_planes)
            current_plane_position = 0;

        ImageView planechase_image = findViewById(R.id.plane_art);
        ImageView shine = findViewById(R.id.shine);
        shine.setVisibility(View.VISIBLE);
        Animation animation = new TranslateAnimation(0, planechase_image.getWidth(),
                0, 0);
        animation.setDuration(500);
        animation.setFillAfter(false);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        shine.startAnimation(animation);
        shine.setVisibility(View.INVISIBLE);

        fill_plane_information();

        Button roll_button = findViewById(R.id.roll_button);
        Button planeswalk_button = findViewById(R.id.planeswalk_button);

        roll_button.setClickable(true);
        roll_button.setAlpha(1f);
        planeswalk_button.setClickable(false);
        planeswalk_button.setAlpha(.2f);
    }

    public void fill_plane_information(){
        TextView title_text = findViewById(R.id.plane_title);
        ImageView planechase_image = findViewById(R.id.plane_art);
        TextView effect_text = findViewById(R.id.effect);
        TextView chaos_text = findViewById(R.id.chaos);

        int current_plane = plane_list.get(current_plane_position);

        title_text.setText(db.all_planechases.get(current_plane).get("title").toString());
        planechase_image.setImageResource((int) db.all_planechases.get(current_plane).get("image"));
        effect_text.setText(db.all_planechases.get(current_plane).get("effect").toString());
        chaos_text.setText(db.all_planechases.get(current_plane).get("chaos").toString());
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
}
