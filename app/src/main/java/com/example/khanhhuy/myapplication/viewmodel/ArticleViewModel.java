package com.example.khanhhuy.myapplication.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.khanhhuy.myapplication.model.Article;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by yeu_thuong on 10/22/2017.
 */

public class ArticleViewModel extends BaseObservable{
    private Article mArticle;

    public ArticleViewModel(Article article){
        mArticle = article;
    }

    @Bindable
    public String getTitle() {
        return mArticle.getTitle();
    }

    @Bindable
    public String getSubtitle() {
        return mArticle.getSubTitle();
    }

    @Bindable
    public String getExcerpt() {
        return mArticle.getExcerpt();
    }

    @Bindable
    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm", Locale.getDefault());
        return sdf.format(mArticle.getDate());
    }
}
