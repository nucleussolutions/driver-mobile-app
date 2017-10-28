package nucleus.com.driverapp.api;

import java.util.Observable;

import nucleus.com.driverapp.response.LoginResponse;

/**
 * Created by kevintan on 26/10/2017.
 */

public interface DriverApi {
    Observable login(String username, String password);
    Observable register(String username, String password);
    Observable getJobs();

}
