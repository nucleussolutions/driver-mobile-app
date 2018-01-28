package nucleus.com.driverapp.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kevintan on 10/11/2017.
 */
public class PrefUtils {

    private static final String REFRESHTOKEN_PREFS = "nucleus.com.driverapp.refreshtoken";
    private static final String AUTHTOKEN_PREFS = "nucleus.com.driverapp.authtoken";

    public static SharedPreferences getPreferences(Context context) {
        //return PreferenceManager.getDefaultSharedPreferences(context);
        return context.getSharedPreferences("nucleus.com.driverapp", Context.MODE_PRIVATE);
    }

    public static void setRefreshToken(String refreshToken, Context context){
        getPreferences(context).edit().putString(REFRESHTOKEN_PREFS, refreshToken).apply();
    }

    public static void setAuthToken(String authToken, Context context){
        getPreferences(context).edit().putString(AUTHTOKEN_PREFS, authToken).apply();
    }

    public static String getRefreshToken(Context context){
        return getPreferences(context).getString(REFRESHTOKEN_PREFS, "");
    }

    public static String getAuthToken(Context context){
        return getPreferences(context).getString(AUTHTOKEN_PREFS, "");
    }
}
