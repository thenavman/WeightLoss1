package com.example.weightloss;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab3_Fragment extends Fragment {
    private static final String TAG = "Tab1_Fragment";
    Button btnTest3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment, container, false);
//        btnTest3=view.findViewById(R.id.button3);
//
//        btnTest3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }
}
