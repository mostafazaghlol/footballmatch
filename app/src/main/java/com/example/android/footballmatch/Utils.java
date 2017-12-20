package com.example.android.footballmatch;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by mostafa on 11/13/17.
 */

public class Utils {

        private static int sTheme;
        public final static int THEME_DEFAULT = 0;
        public final static int THEME_Red = 1;
        public final static int THEME_BLUE = 2;
    public final static int THEME_GREEN = 3;
        /**
         * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
         */
        public static void changeToTheme(Activity activity, int theme)
        {
            sTheme = theme;
            activity.finish();
            activity.startActivity(new Intent(activity, activity.getClass()));
        }
        /** Set the theme of the activity, according to the configuration. */
        public static void onActivityCreateSetTheme(Activity activity)
        {
            switch (sTheme)
            {
                default:
                case THEME_DEFAULT:
                    activity.setTheme(R.style.AppTheme);
                    break;
                case THEME_Red:
                    activity.setTheme(R.style.AppTheme2);
                    break;
                case THEME_BLUE:
                    activity.setTheme(R.style.AppTheme3);
                    break;
                case THEME_GREEN:
                    activity.setTheme(R.style.AppTheme4);
                    break;

            }
        }


}

