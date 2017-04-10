package com.example.parcel.parcelertest.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.parcel.parcelertest.R;
import com.example.parcel.parcelertest.model.User;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    private Button btnSendUser;
    private TextView txtName;
    private TextView txtLastName;
    private TextView txtJob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendUser = (Button) findViewById(R.id.main_btn_send);
        txtName = (TextView) findViewById(R.id.main_txt_name);
        txtLastName = (TextView) findViewById(R.id.main_txt_last_name);
        txtJob = (TextView) findViewById(R.id.main_txt_job);

        btnSendUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(txtName.getText().toString(), txtLastName.getText().toString(), txtJob.getText().toString(), true);
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("user", Parcels.wrap(user));
                startActivity(intent);
            }
        });
    }
}
