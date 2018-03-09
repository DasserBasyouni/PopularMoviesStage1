package com.example.dasser.popularmoviesstage1;

import android.graphics.Bitmap;

/**
    Created by Dasser on 14-Jun-17.
*/

class BitmapAndStringArrayDO {
    private String[] stringData;
    private Bitmap bitmap;

    BitmapAndStringArrayDO(String[] stringData, Bitmap bitmap) {
        this.stringData = stringData;
        this.bitmap = bitmap;
    }

    String[] getStringData() {
        return stringData;
    }

    Bitmap getBitmap() {
        return bitmap;
    }
}
