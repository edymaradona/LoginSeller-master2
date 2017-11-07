package purpose;

/**
 * Created by root on 12/10/17.
 */
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

public class DorvisPurpose extends AppCompatActivity implements TextToSpeech.OnInitListener {
    public TextToSpeech mTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.darvispurpose);
        mTTS = new TextToSpeech(this, this);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int i) {
        mTTS.setLanguage(Locale.ENGLISH);
        mTTS.speak("mera prarthmic uddesh hai insaano ki heefaajat karna aur unke kaamo ko aasaan karna......................dhanyawaad .", TextToSpeech.QUEUE_ADD, null, null);
    }
    public void backpurpose(View view)
    {
        Intent purintent = new Intent(DorvisPurpose.this, SpeakActivity.class);
        startActivity(purintent);
    }
}
