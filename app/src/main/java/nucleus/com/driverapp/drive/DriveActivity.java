package nucleus.com.driverapp.drive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import nucleus.com.driverapp.R;

public class DriveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);
        ButterKnife.bind(this);
    }


    void startDriving(){

    }

    void stopDriving(){

    }

    void reportFailure(){

    }
}
