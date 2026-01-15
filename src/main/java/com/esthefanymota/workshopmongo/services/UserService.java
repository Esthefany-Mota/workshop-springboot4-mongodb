package com.esthefanymota.workshopmongo.services;

import com.esthefanymota.workshopmongo.domain.User;
import com.esthefanymota.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User save(User user){
        return repo.save(user);
    }
}
