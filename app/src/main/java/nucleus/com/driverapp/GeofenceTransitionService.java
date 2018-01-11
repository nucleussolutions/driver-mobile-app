package nucleus.com.driverapp;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;

import nucleus.com.driverapp.util.ErrorMessages;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class GeofenceTransitionService extends IntentService {

    private static final String TAG = "GeofenceTransitionServi";

    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "nucleus.com.driverapp.action.FOO";
    private static final String ACTION_BAZ = "nucleus.com.driverapp.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "nucleus.com.driverapp.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "nucleus.com.driverapp.extra.PARAM2";

    public GeofenceTransitionService() {
        super("GeofenceTransitionService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, GeofenceTransitionService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, GeofenceTransitionService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
            if (geofencingEvent.hasError()) {
                String errorMessage = ErrorMessages.getGeofenceErrorString(this,
                        geofencingEvent.getErrorCode());
//                HTLog.e(TAG, errorMessage);
                return;
            }

            // Get the transition type.
            int geofenceTransition = geofencingEvent.getGeofenceTransition();
            if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_DWELL) {
//                HTLog.i(TAG, "User is dwelling in geo fence.");
//                ActionManager.getSharedManager(getApplicationContext()).OnGeoFenceSuccess();

            } else {
                // Log the error.
//                HTLog.e(TAG, getString(R.string.geofence_transition_invalid_type,
//                        geofenceTransition));
            }

            // Get the geofences that were triggered. A single event can trigger
            // multiple geofences.
//            String geofenceTransitionDetails = getGeofenceTransitionDetails(geofenceTransition,
//                    geofencingEvent.getTriggeringGeofences());

//            HTLog.i(TAG, "GeoFenceTransition Details: " + geofenceTransitionDetails);
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
