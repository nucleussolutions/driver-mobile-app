package nucleus.com.driverapp.register;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by kevintan on 28/10/2017.
 */

public interface RegisterView {
    void showLoading();
    void hideLoading();
    void onSuccess(FirebaseUser user);
    void onFail(Exception exception);
}
