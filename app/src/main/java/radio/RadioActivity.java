package radio;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import java.util.Locale;

import port.PortActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class RadioActivity extends Activity implements TextToSpeech.OnInitListener {
    public TextToSpeech mTTS;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radia);
        mTTS = new TextToSpeech(this, this);

        Intent mIntent = getPackageManager().getLaunchIntentForPackage("com.sec.android.app.fm");
        startActivity(mIntent);
    }
    public void backradio(View view)
    {
        Intent radio = new Intent(RadioActivity.this, SpeakActivity.class);
        startActivity(radio);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int i) {
        mTTS.setLanguage(Locale.ENGLISH);
        mTTS.speak("Radio started......................", TextToSpeech.QUEUE_ADD, null, null);
    }
}
