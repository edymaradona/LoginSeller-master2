package recordstart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import behind.BehindActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class RecordstartActivity extends Activity {
    static final String TAG = "MediaRecording";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordstart);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.imran.mycloud.myrecording");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
    }
    public void backrecordstart(View view)
    {
        Intent intent = new Intent(RecordstartActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
