package drbond.findmyshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Hide the title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
