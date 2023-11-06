package com.system.BorrowingAndLendingSystem.service;

 


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.Notification;
import  com.system.BorrowingAndLendingSystem.repository.NotificationRepository;


@Service
public class NotificationService {

    @Autowired
    private NotificationRepository NotificationRepository;

    public List<Notification> findAll() {
        return NotificationRepository.findAll();
    }

    public Notification findById(Long id) {
        return NotificationRepository.findById(id).orElse(null);
    }

    public void save(Notification Notification) {
    	NotificationRepository.save(Notification);
    }

    public void delete(Long id) {
    	NotificationRepository.deleteById(id);
    }
}
