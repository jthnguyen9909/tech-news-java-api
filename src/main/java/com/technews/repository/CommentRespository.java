package com.technews.repository;

import com.technews.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRespository extends JpaRepository<Comment, Integer> {
    List<Comment> findAllCommentsByPostId(int id);
}
