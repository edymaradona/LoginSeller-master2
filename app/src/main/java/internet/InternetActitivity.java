package internet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import brighton.BrightonActivity;
import speak.SpeakActivity;

/**
 * Created by root on 28/9/17.
 */

public class InternetActitivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internet);
        Intent internet = getPackageManager().getLaunchIntentForPackage("com.sec.android.app.sbrowser");
        startActivity(internet);
    }
    public void backinternet(View view)
    {
        Intent intent = new Intent(InternetActitivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
