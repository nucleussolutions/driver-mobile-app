package nucleus.com.driverapp.login;

import nucleus.com.driverapp.response.AuthResponse;

/**
 * Created by kevintan on 27/10/2017.
 */

public interface LoginView {
    void showLoading();
    void hideLoading();
    void login(String email, String password);
    void onSuccess(AuthResponse response);
    void onFail(String message);
}
