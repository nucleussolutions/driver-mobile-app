package nucleus.com.driverapp.jobdetails;

import nucleus.com.driverapp.response.JobDetailsResponse;

public interface JobDetailsView {
    void showLoading();
    void hideLoading();
    void onSuccess(JobDetailsResponse response);
    void onFailure(Exception ex);
}
