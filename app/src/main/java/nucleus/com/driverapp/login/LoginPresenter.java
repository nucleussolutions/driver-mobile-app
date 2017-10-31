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

    @Inject
    FirebaseAuth mAuth;


    public LoginPresenter(DriverApplication app, LoginView loginView) {
        this.loginView = loginView;
        app.getAppComponent().inject(this);
    }

    public void login(String email, String password){
        this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                this.loginView.onSuccess(this.mAuth.getCurrentUser());
            }else{
                this.loginView.onFail(task.getException());
            }
        });
    }
}
