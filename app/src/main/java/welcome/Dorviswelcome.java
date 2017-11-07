package welcome;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.root.otpex2.R;
import java.util.Locale;
import speak.SpeakActivity;

public class Dorviswelcome extends AppCompatActivity implements TextToSpeech.OnInitListener {
    public TextToSpeech mTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        mTTS = new TextToSpeech(this, this);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int i) {
        mTTS.setLanguage(Locale.UK);//daar vis kee doonii yame apka swaagat hei.."
        mTTS.speak("daar vis kee doonii yame apka swaagat hei..",TextToSpeech.QUEUE_ADD, null, null);
    }
    public void backwelcome(View view)
    {
        Intent welintent = new Intent(Dorviswelcome.this, SpeakActivity.class);
        startActivity(welintent);
    }
}
