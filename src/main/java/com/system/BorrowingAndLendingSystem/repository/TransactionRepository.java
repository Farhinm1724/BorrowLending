package com.system.BorrowingAndLendingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.BorrowingAndLendingSystem.classes.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository <Transaction, Long>{

}
