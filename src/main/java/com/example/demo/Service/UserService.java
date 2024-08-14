package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.Repository;


@Service
public class UserService {
    @Autowired
    Repository repository;

    public void save(User user) {
        repository.save(user);
    }

    public User getbyid(String s) {
        return repository.findById(s).get();
    }
    
}
