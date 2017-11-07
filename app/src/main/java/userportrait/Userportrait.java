package userportrait;

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

public class Userportrait extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userportrait);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);
        Toast.makeText(getApplicationContext(), "USER PORTRAIT", Toast.LENGTH_LONG).show();
    }
    public void backch(View view)
    {
        Intent intent = new Intent(Userportrait.this, SpeakActivity.class);
        startActivity(intent);
    }
}
