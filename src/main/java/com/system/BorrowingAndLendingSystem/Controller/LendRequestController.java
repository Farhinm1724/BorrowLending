package com.system.BorrowingAndLendingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.BorrowingAndLendingSystem.classes.LendRequest;
import com.system.BorrowingAndLendingSystem.service.*;


@Controller
@RequestMapping("/LendRequests")
public class LendRequestController {

    @Autowired
    private LendRequestService LendRequestService;
   
    @GetMapping
    public String listLendRequest(Model model) {
        model.addAttribute("LendRequests", LendRequestService.findAll());
        return "LendRequest/list";
    }

    @GetMapping("/{id}")
    public String viewLendRequest(@PathVariable Long id, Model model) {
        model.addAttribute("LendRequest", LendRequestService.findById(id));
        return "LendRequest/view";
    }

    @GetMapping("/add")
    public String addLendRequestFormForm(Model model) {
        model.addAttribute("LendRequest", new LendRequest());
        return "LendRequest/add";
    }
    
    @PostMapping("/add")
    public String addLendRequestSubmit(@ModelAttribute LendRequest LendRequest) {
        LendRequestService.save(LendRequest);
        return "redirect:/LendRequests";
    }
    @GetMapping("/{id}/edit")
    public String editLendRequestForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", LendRequestService.findById(id));
        return "LendRequest/edit";
    }
    @PostMapping("/{id}/edit")
    public String editLendRequestSubmit(@PathVariable Long id, @ModelAttribute LendRequest LendRequest) {
        LendRequestService.save(LendRequest);  // The repository will update the book if an id is already present
        return "redirect:/LendRequests";
    }
    @GetMapping("/{id}/delete")
    public String deleteLendRequest(@PathVariable Long id) {
        LendRequestService.delete(id);
        return "redirect:/LendRequests";
    }

}
