package com.example.khanhhuy.myapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.khanhhuy.myapplication.R;
import com.example.khanhhuy.myapplication.model.Article;
import com.example.khanhhuy.myapplication.model.ArticleHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Article> mArticles;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.contactList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mArticles = ArticleHelper.getArticles();
        ArticleAdapter adapter = new ArticleAdapter(mArticles);
        mRecyclerView.setAdapter(adapter);
    }
}
