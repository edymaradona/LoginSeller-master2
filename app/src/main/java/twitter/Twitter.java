package twitter;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import java.util.Locale;

import speak.SpeakActivity;
import train.TrainActivity;

/**
 * Created by root on 26/10/17.
 */

public class Twitter extends Activity implements TextToSpeech.OnInitListener {
    public TextToSpeech mTTS;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter);
        mTTS = new TextToSpeech(this, this);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.twitter.com"));
        startActivity(intent);
    }
    public void backtwitter(View view)
    {
        Intent intent = new Intent(Twitter.this, SpeakActivity.class);
        startActivity(intent);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int i) {
        mTTS.setLanguage(Locale.ENGLISH);
        mTTS.speak("twitter webpage login or form opened for you......................", TextToSpeech.QUEUE_ADD, null, null);
    }
}
