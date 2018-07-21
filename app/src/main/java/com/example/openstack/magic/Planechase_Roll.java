package com.example.openstack.magic;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Planechase_Roll extends FragmentActivity {
    boolean doubleBackToExitPressedOnce = false;
    protected int language = 0;
    protected int current_plane_position = 0;
    protected ArrayList<Integer> plane_list = new ArrayList<>();

    protected List<Integer> value_list = Arrays.asList(1, 2, 3, 4, 5, 6);
    protected int mana_cost = 0;
    protected int chaos = 0;
    protected int planeswalk = 0;
    protected Button card1;
    protected Button card2;
    protected Button card3;
    protected Button card4;
    protected Button card5;
    protected Button card6;

    protected Button reroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planechase_roll);

        Intent intent = getIntent();
        if(intent.hasExtra("language"))
            language = intent.getIntExtra("language", 0);

        if(intent.hasExtra("current_plane_position"))
            current_plane_position = intent.getIntExtra("current_plane_position", 0);
        if(intent.hasExtra("planes_random_list"))
            plane_list = intent.getIntegerArrayListExtra("planes_random_list");

        Collections.shuffle(value_list);

        set_mana_message();
        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);

        reroll = findViewById(R.id.reroll_button);
        reroll.setClickable(false);
        reroll.setAlpha(.2f);
    }

    private Intent fill_intent(){
        Intent intent = new Intent(this, Planechase.class);
        intent.putExtra("language", language);
        intent.putExtra("current_plane_position", current_plane_position);
        intent.putIntegerArrayListExtra("planes_random_list", plane_list);
        intent.putExtra("planeswalk", planeswalk);
        intent.putExtra("chaos", chaos);
        return intent;
    }

    public void ok_roll_button(View view){
        finish();
        startActivity(fill_intent());
    }

    public void reroll_cleanup(View view){
        reroll.setClickable(false);
        reroll.setAlpha(.2f);
        planeswalk = 0;
        chaos = 0;
        card1.setBackgroundResource(R.drawable.card_back);
        card2.setBackgroundResource(R.drawable.card_back);
        card3.setBackgroundResource(R.drawable.card_back);
        card4.setBackgroundResource(R.drawable.card_back);
        card5.setBackgroundResource(R.drawable.card_back);
        card6.setBackgroundResource(R.drawable.card_back);

        Collections.shuffle(value_list);
        make_buttons_clickable_state(true);
    }

    public void set_mana_message(){
        String message = "Pay <font color='#EE0000'>" + mana_cost + "</font> mana to roll.";
        TextView textView = findViewById(R.id.mana_cost);
        textView.setText(Html.fromHtml(message));
    }

    private void set_card_clicked(Button card, int order_number){
        card.setClickable(false);

        order_number -= 1;

        int button_value = value_list.get(order_number);
        if(button_value == 1){
            card.setBackgroundResource(R.drawable.planeswalk_card);
            make_buttons_clickable_state(false);
            planeswalk = 1;
        } else if(button_value == 6){
            card.setBackgroundResource(R.drawable.chaos_card);
            make_buttons_clickable_state(false);
            chaos = 1;
        } else {
            card.setBackgroundResource(R.drawable.nothing_card);
            make_buttons_clickable_state(false);
            mana_cost += 1;
            set_mana_message();
            reroll.setClickable(true);
            reroll.setAlpha(1f);
        }
    }

    public void get_button1(View view){
        set_card_clicked(card1, 1);
    }

    public void get_button2(View view){
        set_card_clicked(card2, 2);
    }

    public void get_button3(View view){
        set_card_clicked(card3, 3);
    }

    public void get_button4(View view){
        set_card_clicked(card4, 4);
    }

    public void get_button5(View view){
        set_card_clicked(card5, 5);
    }

    public void get_button6(View view) {
        set_card_clicked(card6, 6);
    }

    public void make_buttons_clickable_state(boolean clickable){
        card1.setClickable(clickable);
        card2.setClickable(clickable);
        card3.setClickable(clickable);
        card4.setClickable(clickable);
        card5.setClickable(clickable);
        card6.setClickable(clickable);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish();
            startActivity(fill_intent());
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again.", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
