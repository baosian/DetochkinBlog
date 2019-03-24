package com.baosian.services;

import com.baosian.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment addComment(Comment comment);
    void delete(Integer id);
    Comment editComment (Comment comment);
    List<Comment> getAllCommentsOfArticle(Integer article_id);
}
