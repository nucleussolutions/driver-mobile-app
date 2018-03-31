package nucleus.com.driverapp.forgetpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;
import nucleus.com.driverapp.DriverApplication;
import nucleus.com.driverapp.R;

public class ForgetPasswordActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        DriverApplication application = (DriverApplication) getApplication();

    }

    @OnClick(R.id.button_request_reset)
    void requestReset(){

    }
}
