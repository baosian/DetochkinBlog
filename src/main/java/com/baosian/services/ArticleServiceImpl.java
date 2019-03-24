package com.baosian.services;

import com.baosian.entity.Article;
import com.baosian.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article addArticle(Article article) {
        Article savedArticle = articleRepository.saveAndFlush(article);
        return savedArticle;
    }

    @Override
    public void delete(Integer id) {
        articleRepository.deleteById(id);
    }

    @Override
    public List<Article> getByName(String name) {
        List<Article> articleList = articleRepository.findAll();
        for(Article article:articleList){
            if (!article.getTitle().contains(name)) {
                articleList.remove(article);
            }
        }
        return articleList;
    }

    @Override
    public Article editArticle(Article article) {
        return articleRepository.saveAndFlush(article);
    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}
