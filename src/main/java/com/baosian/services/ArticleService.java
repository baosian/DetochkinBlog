package com.baosian.services;

import com.baosian.entity.Article;

import java.util.List;

public interface ArticleService {

    Article addArticle(Article article);
    void delete(Integer id);
    List<Article> getByName(String name);
    Article editArticle(Article article);
    List<Article> getAll();
}
