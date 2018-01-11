package nucleus.com.driverapp.drive;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import butterknife.ButterKnife;
import nucleus.com.driverapp.R;
import nucleus.com.driverapp.util.Const;

public class DriveActivity extends AppCompatActivity {


    private static final String TAG = "DriveActivity";
    /**
     * The entry point for interacting with activity recognition.
     */
    private ActivityRecognitionClient mActivityRecognitionClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);
        ButterKnife.bind(this);
    }


    void startDriving(){



        //location updates turned on, and activity recognition activated




        Task<Void> task = mActivityRecognitionClient.requestActivityUpdates(
                Const.DETECTION_INTERVAL_IN_MILLISECONDS,
                getActivityDetectionPendingIntent());

        task.addOnSuccessListener(result -> {
            Toast.makeText(DriveActivity.this,
                    getString(R.string.activity_updates_enabled),
                    Toast.LENGTH_SHORT)
                    .show();
//                setUpdatesRequestedState(true);
//                updateDetectedActivitiesList();
        });

        task.addOnFailureListener(e -> {
            Log.w(TAG, getString(R.string.activity_updates_not_enabled));
            Toast.makeText(DriveActivity.this,
                    getString(R.string.activity_updates_not_enabled),
                    Toast.LENGTH_SHORT)
                    .show();
//                setUpdatesRequestedState(false);
        });

    }

    void stopDriving(){

    }

    void reportFailure(){

    }

    /**
     * Gets a PendingIntent to be sent for each activity detection.
     */
    private PendingIntent getActivityDetectionPendingIntent() {
//        Intent intent = new Intent(this, DetectedActivitiesIntentService.class);

        // We use FLAG_UPDATE_CURRENT so that we get the same pending intent back when calling
        // requestActivityUpdates() and removeActivityUpdates().
//        return PendingIntent.getService(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        return null;
    }
}
