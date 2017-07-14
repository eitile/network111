package com.network111.repository;

import com.network111.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends CrudRepository<User, BigInteger>{

    @Query("SELECT u FROM User u WHERE u.login = :login AND u.password = :password")
    User getUserByCredentials(@Param(value = "login") String login, @Param(value = "password") String password);
}
