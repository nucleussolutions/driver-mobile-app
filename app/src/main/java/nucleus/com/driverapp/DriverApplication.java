package nucleus.com.driverapp;

import android.app.Application;

/**
 * Created by kevintan on 27/10/2017.
 */

public class DriverApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
}
