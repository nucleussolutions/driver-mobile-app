package nucleus.com.driverapp.login;

import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Inject;

import nucleus.com.driverapp.DriverApplication;

/**
 * Created by kevintan on 26/10/2017.
 */

public class LoginPresenter {


    private final LoginView loginView;

    private static final String TAG = "LoginPresenter";

    private FirebaseAuth mAuth;


    public LoginPresenter(DriverApplication app, LoginView loginView) {
        this.loginView = loginView;
        app.getAppComponent().inject(this);
        mAuth = FirebaseAuth.getInstance();
    }

    public void login(){

    }
}
