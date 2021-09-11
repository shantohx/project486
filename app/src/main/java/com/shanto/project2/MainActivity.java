package com.shanto.project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.shanto.project1.extra.NAME";
    public static final String EXT =
            "com.shanto.project1.extra.NID";
    public static final String EXT2 =
            "com.shanto.project1.extra.DATE";
    public static final String EXT3 =
            "com.shanto.project1.extra.BLOOD";


    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;
    private EditText mName;
    private TextView mDate;
    private EditText mNID;
    private EditText mBloodGroup;

    String[] tabNames = {"Basic", "University", "Users"};

    ViewPager2 myViewPager2;
    PagerAdapter myAdapter;
    private ArrayList<Fragment> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager2 = findViewById(R.id.pager);

        arrayList.add(new BasicInformation());
        arrayList.add(new UniversityAssociation());

        myAdapter = new PagerAdapter(getSupportFragmentManager(), getLifecycle());

        myViewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        myViewPager2.setAdapter(myAdapter);

//        myViewPager2.setPageTransformer(new MarginPageTransformer(150));




//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, myViewPager2,
                (tab, position) -> tab.setText(tabNames[position])
        ).attach();
//
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        final ViewPager2 viewPager = findViewById(R.id.pager);
//        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });

    }

//    public void launchSecondActivity(View view) {
//        Intent intent = new Intent(this, SecondActivity.class);
//
//        String name = mName.getText().toString();
//        String date = mDate.getText().toString();
//        String NID = mNID.getText().toString();
//        String blood = mBloodGroup.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, name);
//        intent.putExtra(EXT, NID);
//        intent.putExtra(EXT2, date);
//        intent.putExtra(EXT3, blood);
//        startActivity(intent);
//    }
}