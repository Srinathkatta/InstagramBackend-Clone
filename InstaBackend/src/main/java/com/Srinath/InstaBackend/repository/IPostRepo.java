package com.Srinath.InstaBackend.repository;

import com.Srinath.InstaBackend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
