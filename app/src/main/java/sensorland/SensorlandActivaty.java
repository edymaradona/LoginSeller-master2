package sensorland;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.root.otpex2.R;

import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class SensorlandActivaty extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensorland);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        Toast.makeText(getApplicationContext(), "SENSOR LANDSCAPE", Toast.LENGTH_LONG).show();
    }
    public void backsensorland(View view)
    {
        Intent intent = new Intent(SensorlandActivaty.this, SpeakActivity.class);
        startActivity(intent);
    }
}
