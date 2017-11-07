package gmail;

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

public class GmailActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmail);
        Intent gmail = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
        startActivity(gmail);
    }
    public void backbrighton(View view)
    {
        Intent intent = new Intent(GmailActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
