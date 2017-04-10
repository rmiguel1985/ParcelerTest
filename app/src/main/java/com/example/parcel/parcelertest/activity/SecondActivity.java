package com.example.parcel.parcelertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.parcel.parcelertest.R;
import com.example.parcel.parcelertest.model.User;

import org.parceler.Parcels;

/**
 * Created by Administrador on 01/06/2016.
 */
public class SecondActivity extends AppCompatActivity {

    private User user;
    private TextView txtName;
    private TextView txtLastName;
    private TextView txtJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtName = (TextView) findViewById(R.id.second_txt_name);
        txtLastName = (TextView) findViewById(R.id.second_txt_last_name);
        txtJob = (TextView) findViewById(R.id.second_txt_job);

        user = Parcels.unwrap(getIntent().getParcelableExtra("user"));

        txtName.setText(user.getName());
        txtLastName.setText(user.getLastName());
        txtJob.setText(user.getJob());
    }
}