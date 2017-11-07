package root;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import speak.SpeakActivity;

/**
 * Created by root on 28/9/17.
 */

public class AdbActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adb);
        Intent mIntent = getPackageManager().getLaunchIntentForPackage("com.ttxapps.wifiadb");
        startActivity(mIntent);
    }
    public void backadb(View view)
    {
        Intent intent = new Intent(AdbActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
