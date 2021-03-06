package flighton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import java.io.IOException;

import chrome.ChromeActivity;
import speak.SpeakActivity;

/**
 * Created by root on 28/9/17.
 */

public class FlightonActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flighton);
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec(new String[]{"su",
                    "pm grant com.imran.mycloud.mytest android.permission.WRITE_SECURE_SETTINGS",
                    "settings put global airplane_mode_on 1; am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true"});
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            proc.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void backflighton(View view)
    {
        Intent intent = new Intent(FlightonActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
