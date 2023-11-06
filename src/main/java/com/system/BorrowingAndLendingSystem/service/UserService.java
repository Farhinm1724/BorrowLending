package com.system.BorrowingAndLendingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.User;
import  com.system.BorrowingAndLendingSystem.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public List<User> findAll() {
        return UserRepository.findAll();
    }

    public User findById(Long id) {
        return UserRepository.findById(id).orElse(null);
    }

    public void save(User User) {
        UserRepository.save(User);
    }

    public void delete(Long id) {
        UserRepository.deleteById(id);
    }
}

