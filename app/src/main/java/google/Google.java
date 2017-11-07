package google;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import speak.SpeakActivity;
import twitter.Twitter;

/**
 * Created by root on 26/10/17.
 */

public class Google extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.google);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void backgoogle(View view)
    {
        Intent intent = new Intent(Google.this, SpeakActivity.class);
        startActivity(intent);
    }
}
