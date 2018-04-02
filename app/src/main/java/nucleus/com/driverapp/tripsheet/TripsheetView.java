package nucleus.com.driverapp.tripsheet;

/**
 * Created by kevintan on 29/01/2018.
 */

public interface TripsheetView {
    void showLoading();
    void hideLoading();
    void onSuccess();
    void onFailure();
}
