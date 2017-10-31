package nucleus.com.driverapp.jobs;

import nucleus.com.driverapp.response.JobsResponse;

/**
 * Created by kevintan on 27/10/2017.
 */

public interface JobsView {
    void showLoading();
    void hideLoading();
    void onSuccess(JobsResponse response);
    void onFail(String message);
}
