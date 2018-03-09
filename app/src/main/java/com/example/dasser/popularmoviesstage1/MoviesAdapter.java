package com.example.dasser.popularmoviesstage1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
    Created by Dasser on 12-Jun-17.
*/

class MoviesAdapter extends BaseAdapter {
    private Context mContext;
    private Bitmap[] bitmaps;

    MoviesAdapter(Context c, Bitmap[] bitmaps) {
        mContext = c;
        this.bitmaps = bitmaps;
    }

    public int getCount() {
        return bitmaps.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {

            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT
                    , GridView.LayoutParams.MATCH_PARENT));
            imageView.setAdjustViewBounds(true);
            //imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageBitmap(bitmaps[position]);
        return imageView;
    }

}
