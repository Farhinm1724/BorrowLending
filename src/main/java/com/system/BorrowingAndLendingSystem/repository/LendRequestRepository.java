package com.system.BorrowingAndLendingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.BorrowingAndLendingSystem.classes.LendRequest;


@Repository
public interface LendRequestRepository extends JpaRepository<LendRequest, Long> {
}