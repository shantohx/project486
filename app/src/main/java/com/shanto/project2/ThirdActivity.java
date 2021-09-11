package com.shanto.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.shanto.project1.extra.NAME";
    public static final String EXT =
            "com.shanto.project1.extra.NID";
    public static final String EXT2 =
            "com.shanto.project1.extra.DATE";
    public static final String EXT3 =
            "com.shanto.project1.extra.BLOOD";

    public static final String EXT4 =
            "com.shanto.project1.extra.UNI";
    public static final String EXT5 =
            "com.shanto.project1.extra.DEPT";
    public static final String EXT6 =
            "com.shanto.project1.extra.IDX";
    public static final String EXT7 =
            "com.shanto.project1.extra.LEVEL";
    public static final String EXT8 =
            "com.shanto.project1.extra.EMAIL";
    public static final String EXT9 =
            "com.shanto.project1.extra.PHONE";

    String name, NID, date, blood, uni, dept, idx, lev;

    EditText mEmail, mPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();

        name = intent.getStringExtra(SecondActivity.EXTRA_MESSAGE);
        NID = intent.getStringExtra(SecondActivity.EXT);
        date = intent.getStringExtra(SecondActivity.EXT2);
        blood = intent.getStringExtra(SecondActivity.EXT3);
        uni = intent.getStringExtra(SecondActivity.EXT4);
        dept = intent.getStringExtra(SecondActivity.EXT5);
        idx = intent.getStringExtra(SecondActivity.EXT6);
        lev = intent.getStringExtra(SecondActivity.EXT7);

        TextView textView = findViewById(R.id.text_message);
        TextView textView2 = findViewById(R.id.text_message2);
        TextView textView3 = findViewById(R.id.text_message3);
        TextView textView4 = findViewById(R.id.text_message4);
        TextView textView5 = findViewById(R.id.text_message5);
        TextView textView6 = findViewById(R.id.text_message6);
        TextView textView7 = findViewById(R.id.text_message7);
        TextView textView8 = findViewById(R.id.text_message8);
        textView.setText(name);
        textView2.setText(date);
        textView3.setText(NID);
        textView4.setText(blood);
        textView5.setText(uni);
        textView6.setText(dept);
        textView7.setText(idx);
        textView8.setText(lev);

        mEmail = (EditText) findViewById(R.id.editText_email);
        mPhone = (EditText) findViewById(R.id.editText_phone);
    }

    public void launchFourthActivity(View view){
        Intent intent = new Intent(this, FourthActivity.class);
        String email = mEmail.getText().toString();
        String phone = mPhone.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, name);
        intent.putExtra(EXT, NID);
        intent.putExtra(EXT2, date);
        intent.putExtra(EXT3, blood);
        intent.putExtra(EXT4, uni);
        intent.putExtra(EXT5, dept);
        intent.putExtra(EXT6, idx);
        intent.putExtra(EXT7, lev);
        intent.putExtra(EXT8, email);
        intent.putExtra(EXT9, phone);
        startActivity(intent);
    }
}