package nucleus.com.driverapp.forgetpassword;

import nucleus.com.driverapp.response.ForgetPasswordResponse;

public interface ForgetPasswordView {
    void showLoading();
    void hideLoading();
    void onSuccess(ForgetPasswordResponse response);
    void onFailure(Exception ex);
}
