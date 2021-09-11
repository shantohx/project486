package com.shanto.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{

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
    Object university;
    Object department;
    Object level;

    private EditText mID;
    String name, NID, date, blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        NID = intent.getStringExtra(MainActivity.EXT);
        date = intent.getStringExtra(MainActivity.EXT2);
        blood = intent.getStringExtra(MainActivity.EXT3);
        TextView textView = findViewById(R.id.text_message);
        TextView textView2 = findViewById(R.id.text_message2);
        TextView textView3 = findViewById(R.id.text_message3);
        TextView textView4 = findViewById(R.id.text_message4);
        textView.setText(name);
        textView2.setText(date);
        textView3.setText(NID);
        textView4.setText(blood);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.university, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                university = parent.getItemAtPosition(pos);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.department, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                department = parent.getItemAtPosition(pos);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.level, android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                level = parent.getItemAtPosition(pos);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        mID = (EditText) findViewById(R.id.editText_main2);
    }

    public void launchThirdActivity(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        String uni = university.toString();
        String dept = department.toString();
        String lev = level.toString();
        String idx = mID.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, name);
        intent.putExtra(EXT, NID);
        intent.putExtra(EXT2, date);
        intent.putExtra(EXT3, blood);
        intent.putExtra(EXT4, uni);
        intent.putExtra(EXT5, dept);
        intent.putExtra(EXT6, idx);
        intent.putExtra(EXT7, lev);
        startActivity(intent);
    }

}
