package com.tadeucruz.springoauth2jwt.rest;

import com.tadeucruz.springoauth2jwt.model.User;
import com.tadeucruz.springoauth2jwt.model.UserRole;
import com.tadeucruz.springoauth2jwt.repository.UserRepository;
import com.tadeucruz.springoauth2jwt.repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRolesRepository userRolesRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void postCreateUser() {
        User user = new User();
        user.setEmail("tadeucruz@gmai.com");
        user.setEnabled(1);
        user.setUserName("tadeucruz");
        user.setPassword("1q2w3e");

        userRepository.save(user);

        UserRole role = new UserRole();
        role.setRole("ROLE_USER");
        role.setUserId(user.getId());

        userRolesRepository.save(role);
    }
}