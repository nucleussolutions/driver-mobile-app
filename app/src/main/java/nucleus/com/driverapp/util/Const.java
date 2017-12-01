package nucleus.com.driverapp.util;

import com.google.android.gms.location.DetectedActivity;

/**
 * Created by kevintan on 27/08/2017.
 */

public final class Const {

    private Const() {}

    private static final String PACKAGE_NAME =
            "com.google.android.gms.location.activityrecognition";

    static final String KEY_ACTIVITY_UPDATES_REQUESTED = PACKAGE_NAME +
            ".ACTIVITY_UPDATES_REQUESTED";

    public static final String KEY_DETECTED_ACTIVITIES = PACKAGE_NAME + ".DETECTED_ACTIVITIES";

    /**
     * The desired time between activity detections. Larger values result in fewer activity
     * detections while improving battery life. A value of 0 results in activity detections at the
     * fastest possible rate.
     */
    public static final long DETECTION_INTERVAL_IN_MILLISECONDS = 30 * 1000; // 30 seconds
    /**
     * List of DetectedActivity types that we monitor in this sample.
     */
    static final int[] MONITORED_ACTIVITIES = {
            DetectedActivity.STILL,
            DetectedActivity.ON_FOOT,
            DetectedActivity.WALKING,
            DetectedActivity.RUNNING,
            DetectedActivity.ON_BICYCLE,
            DetectedActivity.IN_VEHICLE,
            DetectedActivity.TILTING,
            DetectedActivity.UNKNOWN
    };
}
