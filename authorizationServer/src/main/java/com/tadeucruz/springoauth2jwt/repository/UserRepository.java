package com.tadeucruz.springoauth2jwt.repository;

import com.tadeucruz.springoauth2jwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByUserName(String username);
}
