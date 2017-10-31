package nucleus.com.driverapp.login;

import com.google.firebase.auth.FirebaseUser;

import nucleus.com.driverapp.response.AuthResponse;

/**
 * Created by kevintan on 27/10/2017.
 */

public interface LoginView {
    void showLoading();
    void hideLoading();
    void onSuccess(FirebaseUser currentUser);
    void onFail(Exception exception);
}
