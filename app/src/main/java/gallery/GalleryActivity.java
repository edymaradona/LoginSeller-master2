package gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import brighton.BrightonActivity;
import speak.SpeakActivity;

/**
 * Created by root on 28/9/17.
 */

public class GalleryActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        Intent gallery = getPackageManager().getLaunchIntentForPackage("com.sec.android.gallery3d");
        startActivity(gallery);
    }
    public void backgallery(View view)
    {
        Intent intent = new Intent(GalleryActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
