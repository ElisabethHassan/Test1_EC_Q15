package com.example.test1_ec_q15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView phoneNum;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = getIntent().getStringExtra("number");
        phoneNum = findViewById(R.id.numberTV_id);

//        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)
//                != PackageManager.PERMISSION_GRANTED){
//            String[] perms = new String[]{android.Manifest.permission.READ_PHONE_STATE};
//            ActivityCompat.requestPermissions(this,perms, 101);
//        }

        if (phoneNum != null) {
            phoneNum.setText(number);
        } else phoneNum.setText("No incoming calls at the moment");

    }


}