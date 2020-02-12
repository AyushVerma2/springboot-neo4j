package com.example.neo4j.com.example.neo4j.service;

import com.example.neo4j.com.example.neo4j.domain.User;
import com.example.neo4j.com.example.neo4j.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}