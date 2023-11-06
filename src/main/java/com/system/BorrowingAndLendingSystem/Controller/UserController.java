package com.system.BorrowingAndLendingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.BorrowingAndLendingSystem.classes.User;
import com.system.BorrowingAndLendingSystem.service.*;


@Controller
@RequestMapping("/books")
public class UserController {

    @Autowired
    private UserService UserService;
   
    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("User", UserService.findAll());
        return "User/list";
    }

    @GetMapping("/{id}")
    public String viewUser(@PathVariable Long id, Model model) {
        model.addAttribute("User", UserService.findById(id));
        return "User/view";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("User", new User());
        return "User/add";
    }
    
    @PostMapping("/add")
    public String addBookSubmit(@ModelAttribute User User) {
        UserService.save(User);
        return "redirect:/Users";
    }
    @GetMapping("/{id}/edit")
    public String editUserForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", UserService.findById(id));
        return "User/edit";
    }
    @PostMapping("/{id}/edit")
    public String editUserSubmit(@PathVariable Long id, @ModelAttribute User User) {
        UserService.save(User);  // The repository will update the book if an id is already present
        return "redirect:/books";
    }
    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        UserService.delete(id);
        return "redirect:/Users";
    }

}
