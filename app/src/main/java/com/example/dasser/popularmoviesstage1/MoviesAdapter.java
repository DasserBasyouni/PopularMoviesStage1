package com.example.dasser.popularmoviesstage1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.dasser.popularmoviesstage1.Model.Movie;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
   Created by Dasser on 12-Jun-17.
 */

class MoviesAdapter extends BaseAdapter {

    private final String TAG = MoviesAdapter.class.getSimpleName();

    private Context mContext;
    private List<Movie> movies;

    MoviesAdapter(Context c, List<Movie> movies) {
        mContext = c;
        this.movies = movies;
    }

    public int getCount() {
        return movies.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        final ImageView imageView;
        if (convertView == null) {

            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT
                    , GridView.LayoutParams.MATCH_PARENT));
            imageView.setAdjustViewBounds(true);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("movie", movies.get(position));
                intent.putExtra("bitmap", ((BitmapDrawable) imageView.getDrawable()).getBitmap());
                mContext.startActivity(intent);
            }
        });

        {

            Picasso.get().load("https://image.tmdb.org/t/p/w185" + movies.get(position).getPoster_path())
                    .into(imageView, new Callback() {
                        @Override
                        public void onSuccess() {
                        }

                        @Override
                        public void onError(Exception e) {
                            Log.e(TAG, "error: " + e);
                        }
                    });

            return imageView;
        }

    }
}
