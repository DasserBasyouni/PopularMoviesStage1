package com.example.dasser.popularmoviesstage1;

/**
   Created by Dasser on 21-Mar-18.
 */

class Utils {

    static String getRateFormat(float rate) {
        return rate + "/10";
    }

    static String getDateFormat(String date) {
        return date.substring(0, 4);
    }
}
