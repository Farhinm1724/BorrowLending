package com.system.BorrowingAndLendingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.Review;
import  com.system.BorrowingAndLendingSystem.repository.ReviewRepository;


@Service
public class ReviewService {

    @Autowired
    private ReviewRepository ReviewRepository;

    public List<Review> findAll() {
        return ReviewRepository.findAll();
    }

    public Review findById(Long id) {
        return ReviewRepository.findById(id).orElse(null);
    }

    public void save(Review Review) {
        ReviewRepository.save(Review);
    }

    public void delete(Long id) {
        ReviewRepository.deleteById(id);
    }
}
