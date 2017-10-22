package com.example.khanhhuy.myapplication.model;

import java.util.Date;

/**
 * Created by yeu_thuong on 10/22/2017.
 */

public class Article {
    private String mTitle;
    private String mSubTitle;
    private String mExcerpt;
    private Date mDate;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(String subTitle) {
        mSubTitle = subTitle;
    }

    public String getExcerpt() {
        return mExcerpt;
    }

    public void setExcerpt(String excerpt) {
        mExcerpt = excerpt;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
