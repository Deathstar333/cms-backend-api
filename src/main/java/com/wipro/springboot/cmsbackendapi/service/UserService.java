package com.wipro.springboot.cmsbackendapi.service;

import com.wipro.springboot.cmsbackendapi.model.User;
import com.wipro.springboot.cmsbackendapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(User user) {
        Optional<User> opt = userRepository.findById(user.getEmail());
        return opt.isPresent() && opt.get().getPassword().equals(user.getPassword());
    }
}
