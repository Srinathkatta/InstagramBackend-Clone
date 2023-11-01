package com.Srinath.InstaBackend.repository;

import com.Srinath.InstaBackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
