package nucleus.com.driverapp.login;

import nucleus.com.driverapp.DriverApplication;

/**
 * Created by kevintan on 26/10/2017.
 */

public class LoginPresenter {


    private final LoginView loginView;


    public LoginPresenter(DriverApplication app, LoginView loginView) {
        this.loginView = loginView;
//        app.getAppComponent().inject(this);
    }
}
