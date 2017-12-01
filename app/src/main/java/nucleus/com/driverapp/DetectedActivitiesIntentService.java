package nucleus.com.driverapp;

import android.app.IntentService;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;

import java.util.ArrayList;

import nucleus.com.driverapp.util.Const;

/**
 * Created by kevintan on 30/11/2017.
 */

public class DetectedActivitiesIntentService extends IntentService {

    private static final String TAG = "DetectedActivitiesInten";

    public DetectedActivitiesIntentService(String name) {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        ActivityRecognitionResult result = ActivityRecognitionResult.extractResult(intent);

        // Get the list of the probable activities associated with the current state of the
        // device. Each activity is associated with a confidence level, which is an int between
        // 0 and 100.
        ArrayList<DetectedActivity> detectedActivities = (ArrayList) result.getProbableActivities();

//        PreferenceManager.getDefaultSharedPreferences(this)
//                .edit()
//                .putString(Const.KEY_DETECTED_ACTIVITIES,
//                        Utils.detectedActivitiesToJson(detectedActivities))
//                .apply();
//
//        // Log each activity.
//        Log.i(TAG, "activities detected");
//        for (DetectedActivity da: detectedActivities) {
//            Log.i(TAG, Utils.getActivityString(
//                    getApplicationContext(),
//                    da.getType()) + " " + da.getConfidence() + "%"
//            );
//        }
    }


}
