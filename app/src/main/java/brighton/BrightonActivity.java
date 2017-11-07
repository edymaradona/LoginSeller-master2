package brighton;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.root.otpex2.R;

import chrome.ChromeActivity;
import speak.SpeakActivity;

import static android.R.attr.checked;

/**
 * Created by root on 28/9/17.
 */

public class BrightonActivity extends Activity {
    Camera camera;
    boolean checked=true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brighton);
        if (checked) {

            //ToDo something
            camera = Camera.open();
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            camera.setParameters(parameters);
            camera.startPreview();

        }
    }
    public void backbrighton(View view)
    {
        Intent intent = new Intent(BrightonActivity.this, SpeakActivity.class);
        startActivity(intent);
    }
}
