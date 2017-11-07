package hardware;

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

public class HardwareActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hardware);
        Intent hd = getPackageManager().getLaunchIntentForPackage("com.dama.hardwareinfo");
        startActivity(hd);
    }
    public void backhardware(View view)
    {
        Intent intent = new Intent(HardwareActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
