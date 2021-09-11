package com.shanto.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    String name, NID, date, blood, uni, dept, idx, lev, email, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Intent intent = getIntent();

        name = intent.getStringExtra(ThirdActivity.EXTRA_MESSAGE);
        NID = intent.getStringExtra(ThirdActivity.EXT);
        date = intent.getStringExtra(ThirdActivity.EXT2);
        blood = intent.getStringExtra(ThirdActivity.EXT3);
        uni = intent.getStringExtra(ThirdActivity.EXT4);
        dept = intent.getStringExtra(ThirdActivity.EXT5);
        idx = intent.getStringExtra(ThirdActivity.EXT6);
        lev = intent.getStringExtra(ThirdActivity.EXT7);
        email = intent.getStringExtra(ThirdActivity.EXT8);
        phone = intent.getStringExtra(ThirdActivity.EXT9);

        TextView textView = findViewById(R.id.text_message);
        TextView textView2 = findViewById(R.id.text_message2);
        TextView textView3 = findViewById(R.id.text_message3);
        TextView textView4 = findViewById(R.id.text_message4);
        TextView textView5 = findViewById(R.id.text_message5);
        TextView textView6 = findViewById(R.id.text_message6);
        TextView textView7 = findViewById(R.id.text_message7);
        TextView textView8 = findViewById(R.id.text_message8);
        TextView textView9 = findViewById(R.id.text_message9);
        TextView textView10 = findViewById(R.id.text_message10);
        textView.setText(name);
        textView2.setText(date);
        textView3.setText(NID);
        textView4.setText(blood);
        textView5.setText(uni);
        textView6.setText(dept);
        textView7.setText(idx);
        textView8.setText(lev);
        textView9.setText(email);
        textView10.setText(phone);
    }
}