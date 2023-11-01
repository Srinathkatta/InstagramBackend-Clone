package com.Srinath.InstaBackend.repository;

import com.Srinath.InstaBackend.model.Follow;
import com.Srinath.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {

    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
