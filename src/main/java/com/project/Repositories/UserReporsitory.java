package com.project.Repositories;

import com.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserReporsitory extends JpaRepository<User, Integer> {

    public List<User> findAll();

}
