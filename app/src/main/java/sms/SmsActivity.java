package sms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import brighton.BrightonActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class SmsActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms);
    }
    public void backsms(View view)
    {
        Intent intent = new Intent(SmsActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
