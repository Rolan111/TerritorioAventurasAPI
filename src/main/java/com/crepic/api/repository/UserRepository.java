package com.crepic.api.repository;

import com.crepic.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserAndPassword(String user, String password);

    @Query(value = "SELECT * FROM data", nativeQuery = true)
    List<User> query();
}
