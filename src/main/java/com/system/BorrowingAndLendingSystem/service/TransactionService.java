package com.system.BorrowingAndLendingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.Transaction;
import  com.system.BorrowingAndLendingSystem.repository.TransactionRepository;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository TransactionRepository;

    public List<Transaction> findAll() {
        return TransactionRepository.findAll();
    }

    public Transaction findById(Long id) {
        return TransactionRepository.findById(id).orElse(null);
    }

    public void save(Transaction Transaction) {
        TransactionRepository.save(Transaction);
    }

    public void delete(Long id) {
        TransactionRepository.deleteById(id);
    }
}
