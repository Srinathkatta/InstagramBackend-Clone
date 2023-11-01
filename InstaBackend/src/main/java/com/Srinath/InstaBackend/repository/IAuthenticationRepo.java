package com.Srinath.InstaBackend.repository;

import com.Srinath.InstaBackend.model.AuthenticationToken;
import com.Srinath.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
