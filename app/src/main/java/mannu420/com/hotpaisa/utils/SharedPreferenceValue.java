package mannu420.com.hotpaisa.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;


/**
 * Created by RAFI on 9/18/2016.
 */

public class SharedPreferenceValue {


    public static void setLoggedInUser(Context context, long userID) {
        SharedPreferences settings = context.getSharedPreferences("loggedUser", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong("userID", userID);
        editor.commit();
    }

    public static long getLoggedinUser(Context context) {
        SharedPreferences settings = context.getSharedPreferences("loggedUser", 0);
        long userID = settings.getLong("userID", -1);
        return userID;
    }

    public static void clearLoggedInuserData(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("loggedUser", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }

    public static void setTodayPointLimit(Context context, int pointsOfToday) {
        SharedPreferences settings = context.getSharedPreferences("userPoints", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("pointsOfToday", pointsOfToday);
        editor.commit();
    }

    public static int getTodayPointLimit(Context context) {
        SharedPreferences settings = context.getSharedPreferences("userPoints", 0);
        int pointsOfToday = settings.getInt("pointsOfToday", -1);
        return pointsOfToday;
    }

    public static void clearTodayPointLimitData(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("userPoints", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }


}
