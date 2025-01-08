package com.example.medicineshop.controller;

import com.example.medicineshop.model.Medicine;
import com.example.medicineshop.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/add")
    public String addMedicine(Medicine medicine, Model model) {
        try {
            medicineService.addMedicine(medicine);
            model.addAttribute("message", "Medicine saved successfully!");
            model.addAttribute("messageType", "success");
        } catch (Exception e) {
            model.addAttribute("message", "Failed to save medicine.");
            model.addAttribute("messageType", "error");
        }
        return "index";
    }

    @GetMapping("/search")
    public String searchMedicine(@RequestParam("name") String name, Model model) {
        Medicine medicine = medicineService.findMedicine(name);
        if (medicine != null) {
            model.addAttribute("medicine", medicine);
            return "medicine_details";
        } else {
            model.addAttribute("message", "Medicine not found.");
            model.addAttribute("messageType", "error");
            return "index";
        }
    }

    @GetMapping("/delete")
    public String deleteMedicine(@RequestParam("id") Long id, Model model) {
        try {
            medicineService.deleteMedicine(id);
            model.addAttribute("message", "Medicine deleted successfully!");
            model.addAttribute("messageType", "success");
        } catch (Exception e) {
            model.addAttribute("message", "Failed to delete medicine.");
            model.addAttribute("messageType", "error");
        }
        return "index";
    }
}
