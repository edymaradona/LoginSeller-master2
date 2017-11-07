package userlandscape;

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

public class UserlandscapeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlandscape);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE);
        Toast.makeText(getApplicationContext(), "USER LANDSCAPE", Toast.LENGTH_LONG).show();
    }
    public void backuserlandscape(View view)
    {
        Intent intent = new Intent(UserlandscapeActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
