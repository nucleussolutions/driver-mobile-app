package nucleus.com.driverapp;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import nucleus.com.driverapp.api.DriverApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by kevintan on 28/08/2017.
 */
@Module
public class AppModule {

    private final DriverApplication application;


    public AppModule(DriverApplication application) {
        FirebaseApp.initializeApp(application.getApplicationContext());
        this.application = application;
    }

    @Provides
    @Singleton
    Context getApplicationContext(){
        return this.application.getApplicationContext();
    }

    @Provides
    @Singleton
    DriverApi providesDriverApi(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://ethermine.org/api/miner_new/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(DriverApi.class);
    }

    @Provides
    @Singleton
    FirebaseAuth providesFirebaseAuth(){
        return FirebaseAuth.getInstance();
    }
}
