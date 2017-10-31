package nucleus.com.driverapp.register;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import nucleus.com.driverapp.DriverApplication;

/**
 * Created by kevintan on 31/10/2017.
 */

public class RegisterPresenter {

    private final RegisterView registerView;

    @Inject
    FirebaseAuth firebaseAuth;

    public RegisterPresenter(DriverApplication app, RegisterView registerView) {
        this.registerView = registerView;
        app.getAppComponent().inject(this);
    }

    void register(String email, String password){
        this.firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                // TODO: 31/10/2017 store credentials somewhere in shared preferences
                this.registerView.onSuccess(user);
            }else{
                this.registerView.onFail(task.getException());
            }
        });
    }
}
