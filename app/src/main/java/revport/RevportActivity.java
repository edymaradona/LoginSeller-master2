package revport;

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

public class RevportActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.revport);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);
        Toast.makeText(getApplicationContext(), "REVERSE PORTRAIT", Toast.LENGTH_LONG).show();
    }
    public void backrevport(View view)
    {
        Intent intent = new Intent(RevportActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
