package nucleus.com.driverapp.phonelogin;

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.OnClick;
import nucleus.com.driverapp.BaseActivity;
import nucleus.com.driverapp.R;
import nucleus.com.driverapp.response.ErrorResponse;
import nucleus.com.driverapp.response.PhoneLoginResponse;

public class PhoneLoginActivity extends BaseActivity implements PhoneLoginView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonelogin);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.phone_sign_in_button)
    void phoneLoginClick(){

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onSuccess(PhoneLoginResponse response) {

    }

    @Override
    public void onFailure(ErrorResponse response) {

    }
}
