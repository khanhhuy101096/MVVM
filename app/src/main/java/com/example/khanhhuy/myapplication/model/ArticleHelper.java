package com.example.khanhhuy.myapplication.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yeu_thuong on 10/22/2017.
 */

public class ArticleHelper {

    public static List<Article> getArticles(){
        List<Article> articles = new ArrayList<>();
        for (int i=0; i<20; i++) {
            Article article = new Article();
            article.setTitle("Chi pu ra bai hat moi");
            article.setSubTitle("Tu hom nay");
            article.setExcerpt("O O O O O");
            article.setDate(new Date());
            Log.e("khanhhuy",""+new Date());
            articles.add(article);
        }
        return articles;
    }
}
