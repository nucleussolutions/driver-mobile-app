package nucleus.com.driverapp.api;


import io.reactivex.Observable;
import nucleus.com.driverapp.response.JobsResponse;
import nucleus.com.driverapp.response.LoginResponse;
import nucleus.com.driverapp.response.AuthResponse;

/**
 * Created by kevintan on 26/10/2017.
 */

public interface DriverApi {
    Observable<LoginResponse> login(String username, String password);
    Observable<AuthResponse> register(String username, String password);
    Observable<JobsResponse> getJobs();

}
