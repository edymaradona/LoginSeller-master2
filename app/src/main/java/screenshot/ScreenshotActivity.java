package screenshot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import java.io.DataOutputStream;

import chrome.ChromeActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class ScreenshotActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screenshot);
        try {
            Process process = Runtime.getRuntime().exec("su");
            DataOutputStream os = new DataOutputStream(process.getOutputStream());

            os.writeBytes("/system/bin/screencap -p /sdcard/s.png\n");
            os.writeBytes("exit\n");
            os.flush();
            os.close();

            process.waitFor();
        } catch (Exception e) {
        }
    }
    public void backscreenshot(View view)
    {
        Intent intent = new Intent(ScreenshotActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
