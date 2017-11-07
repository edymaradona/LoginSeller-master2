package behind;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;
import com.example.root.otpex2.R;
import java.util.Locale;
import speak.SpeakActivity;
public class BehindActivity extends Activity implements TextToSpeech.OnInitListener {
    public TextToSpeech mTTS;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behind);
        mTTS = new TextToSpeech(this, this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_BEHIND);
        Toast.makeText(getApplicationContext(), "BEHIND", Toast.LENGTH_LONG).show();
    }
    public void backbehind(View view)
    {
        Intent intent = new Intent(BehindActivity.this, SpeakActivity.class);
        startActivity(intent);
    } @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int i) {
        mTTS.setLanguage(Locale.ENGLISH);
        mTTS.speak("Behind sensor activited......................", TextToSpeech.QUEUE_ADD, null, null);
    }

}
