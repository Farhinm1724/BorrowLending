package com.system.BorrowingAndLendingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.BorrowRequest;
import  com.system.BorrowingAndLendingSystem.repository.BorrowRequestRepository;


@Service
public class BorrowRequestService {

    @Autowired
    private BorrowRequestRepository BorrowRequestRepository;

    public List<BorrowRequest> findAll() {
        return BorrowRequestRepository.findAll();
    }

    public BorrowRequest findById(Long id) {
        return BorrowRequestRepository.findById(id).orElse(null);
    }

    public void save(BorrowRequest BorrowRequest) {
       BorrowRequestRepository.save(BorrowRequest);
    }

    public void delete(Long id) {
        BorrowRequestRepository.deleteById(id);
    }
}