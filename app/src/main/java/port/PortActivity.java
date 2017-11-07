package port;

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

public class PortActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.port);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toast.makeText(getApplicationContext(), "PORTRAIT", Toast.LENGTH_LONG).show();
    }
    public void backport(View view)
    {
        Intent intent = new Intent(PortActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
