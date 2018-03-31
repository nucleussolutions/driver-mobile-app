package nucleus.com.driverapp.forgetpassword;

public interface ForgetPasswordView {
    void showLoading();
    void hideLoading();
    void onSuccess();
    void onFailure(Exception ex);
}
