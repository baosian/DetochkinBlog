package com.baosian.services;

import com.baosian.entity.Comment;
import com.baosian.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        Comment savedComment = commentRepository.saveAndFlush(comment);
        return savedComment;
    }

    @Override
    public void delete(Integer id) {
        commentRepository.deleteById(id);
    }

    @Override
    public Comment editComment(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }

    @Override
    public List<Comment> getAllCommentsOfArticle(Integer article_id) {
        return commentRepository.findAll();
    }
}
