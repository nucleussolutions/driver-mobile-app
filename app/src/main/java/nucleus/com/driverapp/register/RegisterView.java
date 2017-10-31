package nucleus.com.driverapp.register;

/**
 * Created by kevintan on 28/10/2017.
 */

public interface RegisterView {
    void showLoading();
    void hideLoading();
    void register(String email, String password);
}
