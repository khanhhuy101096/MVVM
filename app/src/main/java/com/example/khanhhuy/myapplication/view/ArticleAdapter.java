package com.example.khanhhuy.myapplication.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.khanhhuy.myapplication.R;
import com.example.khanhhuy.myapplication.databinding.RowArticleBinding;
import com.example.khanhhuy.myapplication.model.Article;
import com.example.khanhhuy.myapplication.viewmodel.ArticleViewModel;

import java.util.List;

/**
 * Created by yeu_thuong on 10/22/2017.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.BindingHolder> {
    private List<Article> mArticles;

    public ArticleAdapter(List<Article> mArticles) {
        this.mArticles = mArticles;
    }


    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RowArticleBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.row_article, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        RowArticleBinding binding = holder.binding;
        binding.setData(new ArticleViewModel(mArticles.get(position)));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private RowArticleBinding binding;

        public BindingHolder(RowArticleBinding binding) {
            super(binding.linearMain);
            this.binding = binding;
        }
    }
}
