package com.shanto.project2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UniversityAssociation extends Fragment {
    private UserViewModel mUserViewModel;
    private static final String LOG_TAG =
            UniversityAssociation.class.getSimpleName();

    public UniversityAssociation() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_university_association, container, false);
        mUserViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        return view;
    }
}