package nucleus.com.driverapp;

import dagger.Component;
import nucleus.com.driverapp.drive.DrivePresenter;

/**
 * Created by kevintan on 28/08/2017.
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DrivePresenter presenter);
}
