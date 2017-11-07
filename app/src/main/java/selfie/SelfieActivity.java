package selfie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import brighton.BrightonActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class SelfieActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selfie);
        Intent selfie = getPackageManager().getLaunchIntentForPackage("com.imran.mycloud.autocamera");
        if (selfie != null) {
            startActivity(selfie);
        }
    }
    public void backselfie(View view)
    {
        Intent intent = new Intent(SelfieActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
