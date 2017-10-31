package nucleus.com.driverapp.drive;

public interface DriveView {
    void showLoading();
    void hideLoading();
    void submitLocation(Double lat, Double lng);
}
