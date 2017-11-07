package wifioff;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import java.util.Locale;

import paytm.PaytmActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class Wifioff extends Activity implements TextToSpeech.OnInitListener {
    public TextToSpeech mTTS;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifioff);
        mTTS = new TextToSpeech(this, this);
        WifiManager wifimanager;
        wifimanager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        wifimanager.setWifiEnabled(false);
    }
    public void backwifioff(View view)
    {
        Intent intent = new Intent(Wifioff.this, SpeakActivity.class);
        startActivity(intent);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int i) {
        mTTS.setLanguage(Locale.ENGLISH);
        mTTS.speak("wifi turned off......................", TextToSpeech.QUEUE_ADD, null, null);
    }
}
