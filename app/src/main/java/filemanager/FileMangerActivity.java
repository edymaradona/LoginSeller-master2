package filemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.root.otpex2.R;

import brighton.BrightonActivity;
import speak.SpeakActivity;

/**
 * Created by root on 29/9/17.
 */

public class FileMangerActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filemanager);
        Intent filem = getPackageManager().getLaunchIntentForPackage("com.imran.mycloud.filemanager");
        if (filem != null) {
            startActivity(filem);//null pointer check in case package name was not found
        }
    }
    public void backfilemanager(View view)
    {
        Intent intent = new Intent(FileMangerActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
