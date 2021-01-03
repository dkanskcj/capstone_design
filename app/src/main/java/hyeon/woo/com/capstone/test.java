package hyeon.woo.com.capstone;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test extends AppCompatActivity {
    private Button buttonSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);

//        Intent serviceintent = new Intent(test.this,"class명");
        startService(serviceintent);
    }

}


//public class MyService extends Service {
//    NotificationManager Notifi_M; ServiceThread thread;
//    ServiceThread thread;
//}

