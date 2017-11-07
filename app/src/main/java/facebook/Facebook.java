package facebook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import speak.SpeakActivity;

/**
 * Created by root on 26/10/17.
 */

public class Facebook extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.facebook.com"));
        startActivity(intent);
    }
    public void backface(View view){
        Intent intent = new Intent(Facebook.this, SpeakActivity.class);
        startActivity(intent);
    }
}
