package com.system.BorrowingAndLendingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.BorrowingAndLendingSystem.classes.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}