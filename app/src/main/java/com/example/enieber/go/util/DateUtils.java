package com.example.enieber.go.util;


import android.icu.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

public final class DateUtils {

    private DateUtils() {
    }

    public static String getDayOfTheWeekFromUnixTime(int unixTime) {
        Date date = new Date((long) unixTime * 1000);
        return new SimpleDateFormat("EE", Locale.getDefault()).format(date);
    }

}