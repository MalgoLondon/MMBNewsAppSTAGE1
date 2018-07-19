package com.example.android.mmbnewsappstage1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewsObject {

    /**
     * An {@link NewsObject} object contains information related to a single article.
     */


        /** title */
        private String mTitle;

        /** category */
        private String mCategory;

        /** publication date */
        private String mDate;

    /** publication url */
    private String mUrl;


        /**
         * Constructs a new {@link NewsObject} object.
         *
         * @param title is the title of the article
         * @param category is the category of the article
         * @param date is when the article was published
         *             */
        public NewsObject(String title, String category, String date, String url) {
            mTitle = title;
            mCategory = category;
            mDate = date;
            mUrl=url;
        }

        /**
         * Returns the article title.
         */
        public String getTitle() {
            return mTitle;
        }

        /**
         * Returns the category of the article.
         */
        public String getCategory() {
            return mCategory;
        }

        /**
         * Returns the publishing date.
         */
        public String getDate() {
            return mDate;
        }
    /**
     * Returns the publishing url.
     */
    public String getUrl() {
        return mUrl;
    }
    }

