package xir4n05.remidiuts.telkomschid.remidiuts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSwipe, btnTabs, btnSpinner, btnDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwipe = (Button) findViewById(R.id.swipe);
        btnTabs = (Button) findViewById(R.id.tabs);
        btnSpinner = (Button) findViewById(R.id.spinner);
        btnDrawer = (Button) findViewById(R.id.drawer);

    }
}
