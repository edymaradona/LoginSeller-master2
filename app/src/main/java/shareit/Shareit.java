package shareit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import ludo.Ludo;
import speak.SpeakActivity;

/**
 * Created by root on 27/10/17.
 */

public class Shareit extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shareit);
        Intent mIntent = getPackageManager().getLaunchIntentForPackage("com.lenovo.anyshare.gps");
        startActivity(mIntent);
    }
    public void backshare(View view){
        Intent ludo = new Intent(Shareit.this, SpeakActivity.class);
        startActivity(ludo);
    }
}
