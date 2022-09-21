package com.geektech.a3hw2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment_Count extends Fragment {
private Button buttonp ,buttonm;
private TextView text;
Integer zero = 0;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment__count, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonp = (Button)view.findViewById(R.id.Click1);
        buttonm = (Button) view.findViewById(R.id.Click2);
        text = (TextView) view.findViewById(R.id.zero);
        Click();
    }

    private void Click() {
      buttonp.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              zero++;
              text.setText(zero.toString());
          }
      });
      buttonm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              zero--;
              text.setText(zero.toString());

          }
      });
    }
}