package com.system.BorrowingAndLendingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.BorrowingAndLendingSystem.classes.Item;
import  com.system.BorrowingAndLendingSystem.repository.ItemRepository;


@Service
public class ItemService {

    @Autowired
    private ItemRepository ItemRepository;

    public List<Item> findAll() {
        return ItemRepository.findAll();
    }

    public Item findById(Long id) {
        return ItemRepository.findById(id).orElse(null);
    }

    public void save(Item Item) {
        ItemRepository.save(Item);
    }

    public void delete(Long id) {
        ItemRepository.deleteById(id);
    }
}