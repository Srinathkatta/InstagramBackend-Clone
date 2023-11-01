package com.Srinath.InstaBackend.repository;

import com.Srinath.InstaBackend.model.Comment;
import com.Srinath.InstaBackend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
    List<Comment> findByInstaPost(Post myPost);
}
