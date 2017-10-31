package nucleus.com.driverapp;

import javax.inject.Singleton;

import dagger.Component;
import nucleus.com.driverapp.drive.DrivePresenter;
import nucleus.com.driverapp.jobs.JobsPresenter;
import nucleus.com.driverapp.login.LoginPresenter;
import nucleus.com.driverapp.register.RegisterPresenter;

/**
 * Created by kevintan on 28/08/2017.
 */
@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    void inject(DrivePresenter presenter);
    void inject(LoginPresenter presenter);
    void inject(JobsPresenter presenter);
    void inject(RegisterPresenter registerPresenter);

}
