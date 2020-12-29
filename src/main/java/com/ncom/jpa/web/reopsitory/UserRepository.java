package com.ncom.jpa.web.reopsitory;

import com.ncom.jpa.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    @Query("select u from User u")
    List<Optional<User>> getUserList();
}
