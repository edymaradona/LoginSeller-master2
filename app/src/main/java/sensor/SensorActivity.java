package sensor;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.root.otpex2.R;

import chrome.ChromeActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class SensorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        Toast.makeText(getApplicationContext(), "SENSOR", Toast.LENGTH_LONG).show();
    }
    public void backsensor(View view)
    {
        Intent intent = new Intent(SensorActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
