package com.system.BorrowingAndLendingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.BorrowingAndLendingSystem.classes.BorrowRequest;


@Repository
public interface BorrowRequestRepository extends JpaRepository<BorrowRequest, Long> {
}
