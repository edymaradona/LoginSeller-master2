package nosensor;

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

public class NosensorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nosensor);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        Toast.makeText(getApplicationContext(), "NO SENSOR", Toast.LENGTH_LONG).show();
    }
    public void backnosensor(View view)
    {
        Intent intent = new Intent(NosensorActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
