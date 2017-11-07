package fulluser;

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
 * Created by root on 28/9/17.
 */

public class FulluserActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fulluser);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_USER);
        Toast.makeText(getApplicationContext(), "FULL USER", Toast.LENGTH_LONG).show();
    }
    public void backfulluser(View view)
    {
        Intent intent = new Intent(FulluserActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
