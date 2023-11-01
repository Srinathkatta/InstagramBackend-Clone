package com.Srinath.InstaBackend.repository;

import com.Srinath.InstaBackend.model.Like;
import com.Srinath.InstaBackend.model.Post;
import com.Srinath.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {


    List<Like> findByInstaPost(Post myPost);

    List<Like> findByInstaPostAndLiker(Post instaPostToBeLiked, User liker);
}
