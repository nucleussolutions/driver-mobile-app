package nucleus.com.driverapp.forgetpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;
import nucleus.com.driverapp.DriverApplication;
import nucleus.com.driverapp.R;
import nucleus.com.driverapp.response.ForgetPasswordResponse;

public class ForgetPasswordActivity extends AppCompatActivity implements ForgetPasswordView{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        DriverApplication application = (DriverApplication) getApplication();

    }

    @OnClick(R.id.button_request_reset)
    void requestReset(){

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onSuccess(ForgetPasswordResponse response) {

    }

    @Override
    public void onFailure(Exception ex) {

    }
}
