package nucleus.com.driverapp.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kevintan on 10/11/2017.
 */
public class PrefUtils {


    public static SharedPreferences getPreferences(Context context) {
        //return PreferenceManager.getDefaultSharedPreferences(context);
        return context.getSharedPreferences("nucleus.com.driverapp", Context.MODE_PRIVATE);
    }


}
