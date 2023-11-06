package com.system.BorrowingAndLendingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.LendRequest;
import  com.system.BorrowingAndLendingSystem.repository.LendRequestRepository;


@Service
public class LendRequestService {

    @Autowired
    private LendRequestRepository LendRequestRepository;

    public List<LendRequest> findAll() {
        return LendRequestRepository.findAll();
    }

    public LendRequest findById(Long id) {
        return LendRequestRepository.findById(id).orElse(null);
    }

    public void save(LendRequest LendRequest) {
      LendRequestRepository.save(LendRequest);
    }

    public void delete(Long id) {
       LendRequestRepository.deleteById(id);
    }
}
