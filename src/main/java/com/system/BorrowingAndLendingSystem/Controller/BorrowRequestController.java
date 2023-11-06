package com.system.BorrowingAndLendingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.BorrowingAndLendingSystem.classes.BorrowRequest;
import com.system.BorrowingAndLendingSystem.service.*;


@Controller
@RequestMapping("/BorrowRequests")
public class BorrowRequestController {

    @Autowired
    private BorrowRequestService BorrowRequestService;
   
    @GetMapping
    public String listBorrowRequest(Model model) {
        model.addAttribute("BorrowRequests", BorrowRequestService.findAll());
        return "BorrowRequest/list";
    }

    @GetMapping("/{id}")
    public String viewBorrowRequest(@PathVariable Long id, Model model) {
        model.addAttribute("BorrowRequest", BorrowRequestService.findById(id));
        return "BorrowRequest/view";
    }

    @GetMapping("/add")
    public String addBorrowRequestFormForm(Model model) {
        model.addAttribute("BorrowRequest", new BorrowRequest());
        return "BorrowRequest/add";
    }
    
    @PostMapping("/add")
    public String addBorrowRequestSubmit(@ModelAttribute BorrowRequest BorrowRequest) {
        BorrowRequestService.save(BorrowRequest);
        return "redirect:/BorrowRequests";
    }
    @GetMapping("/{id}/edit")
    public String editBorrowRequestForm(@PathVariable Long id, Model model) {
        model.addAttribute("BorrowRequest", BorrowRequestService.findById(id));
        return "BorrowRequest/edit";
    }
    @PostMapping("/{id}/edit")
    public String editBorrowRequestSubmit(@PathVariable Long id, @ModelAttribute BorrowRequest BorrowRequest) {
        BorrowRequestService.save(BorrowRequest);  // The repository will update the book if an id is already present
        return "redirect:/BorrowRequests";
    }
    @GetMapping("/{id}/delete")
    public String deleteLendRequest(@PathVariable Long id) {
       BorrowRequestService.delete(id);
        return "redirect:/BorrowRequests";
    }

}
