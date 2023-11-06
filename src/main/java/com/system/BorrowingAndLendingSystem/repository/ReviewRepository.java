package com.system.BorrowingAndLendingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.BorrowingAndLendingSystem.classes.Review;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}