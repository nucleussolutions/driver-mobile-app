package nucleus.com.driverapp.phonelogin;

import nucleus.com.driverapp.response.ErrorResponse;
import nucleus.com.driverapp.response.PhoneLoginResponse;

public interface PhoneLoginView {
    void showLoading();
    void hideLoading();
    void onSuccess(PhoneLoginResponse response);
    void onFailure(ErrorResponse response);
}
