package com.shanto.project2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Calendar;
import java.util.Date;

public class BasicInformation extends Fragment implements Parcelable{
    ViewPager2 viewPager;
    PagerAdapter demoAdapter;
    public static final String ARG_OBJECT = "object";

    private static final String LOG_TAG =
            BasicInformation.class.getSimpleName();


    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;
    private EditText mName;
    private TextView mDate;
    private EditText mNID;
    private EditText mBloodGroup;


    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public BasicInformation createFromParcel(Parcel in) {
            return new BasicInformation(in);
        }

        public BasicInformation[] newArray(int size) {
            return new BasicInformation[size];
        }
    };
    public String name;
    public String nID;
    public String bloodGroup;
    public String birthDate;

    public BasicInformation() {

    }


    public BasicInformation(String n, String m, String o, String p) {
        this.name = n;
        this.nID = m;
        this.bloodGroup= o;
        this.birthDate = p;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public BasicInformation(Parcel in) {
        name = in.readString();
        nID = in.readString();
        bloodGroup = in.readString();
        birthDate = in.readString();
    }
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.fragment_basic_information);
//        dateView = (TextView) findViewById(R.id.textView_birthDate);
//        calendar = Calendar.getInstance();
//        year = calendar.get(Calendar.YEAR);
//
//        month = calendar.get(Calendar.MONTH);
//        day = calendar.get(Calendar.DAY_OF_MONTH);
//        showDate(year, month+1, day);
//        mName = findViewById(R.id.editText_name);
//        mDate = findViewById(R.id.textView3);
//        mNID = findViewById(R.id.editText_nid);
//        mBloodGroup = findViewById(R.id.editText_blood);
//    }

    public void showDatePicker(View view) {
        DialogFragment datePicker = new DatePickerFragment();
        datePicker.show(getActivity().getSupportFragmentManager(), "datePicker");
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        birthDate = (month_string +
                "/" + day_string + "/" + year_string);
    }




    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.nID);
        dest.writeString(this.bloodGroup);
        dest.writeString(this.birthDate);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_basic_information, container, false);

        dateView = (TextView) view.findViewById(R.id.button1);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        mName = view.findViewById(R.id.editText_name);
        mDate = view.findViewById(R.id.textView_birthDate);
        mNID = view.findViewById(R.id.editText_nid);
        mBloodGroup = view.findViewById(R.id.editText_blood);
        Log.d(LOG_TAG, "Button clicked!1");
        return view;
    }

}