package com.system.BorrowingAndLendingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.BorrowingAndLendingSystem.classes.Item;
import com.system.BorrowingAndLendingSystem.service.ItemService;


@Controller
@RequestMapping("/Items")
public class ItemController {

    @Autowired
    private ItemService ItemService;
   
    @GetMapping
    public String listItems(Model model) {
        model.addAttribute("Items", ItemService.findAll());
        return "Item/list";
    }

    @GetMapping("/{id}")
    public String viewItem(@PathVariable Long id, Model model) {
        model.addAttribute("Item", ItemService.findById(id));
        return "Item/view";
    }

    @GetMapping("/add")
    public String addItemForm(Model model) {
        model.addAttribute("Item", new Item());
        return "Item/add";
    }
    
    @PostMapping("/add")
    public String addItemSubmit(@ModelAttribute Item Item) {
        ItemService.save(Item);
        return "redirect:/Items";
    }
    @GetMapping("/{id}/edit")
    public String editItemForm(@PathVariable Long id, Model model) {
        model.addAttribute("Item", ItemService.findById(id));
        return "Item/edit";
    }
    @PostMapping("/{id}/edit")
    public String editItemSubmit(@PathVariable Long id, @ModelAttribute Item Item) {
        ItemService.save(Item); 
        return "redirect:/Items";
    }
    @GetMapping("/{id}/delete")
    public String deleteItem(@PathVariable Long id) {
        ItemService.delete(id);
        return "redirect:/Items";
    }

}
