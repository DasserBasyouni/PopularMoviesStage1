package com.example.dasser.popularmoviesstage1.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 Created by Dasser on 16-Mar-18.
 */

public class Movie implements Parcelable {

    private float vote_average;
    private String original_title;
    private String  poster_path;
    private String overview;
    private String release_date;

    public float getVote_average() {
        return vote_average;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    private Movie(Parcel in) {
        vote_average = in.readFloat();
        original_title = in.readString();
        poster_path = in.readString();
        overview = in.readString();
        release_date = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(vote_average);
        dest.writeString(original_title);
        dest.writeString(poster_path);
        dest.writeString(overview);
        dest.writeString(release_date);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}