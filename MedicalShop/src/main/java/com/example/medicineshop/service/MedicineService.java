package com.example.medicineshop.service;

import com.example.medicineshop.model.Medicine;
import com.example.medicineshop.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    // Add a new medicine
    public void addMedicine(Medicine medicine) {
        medicineRepository.save(medicine);
    }

    // Find a medicine by name
    public Medicine findMedicine(String name) {
        return medicineRepository.findByName(name);
    }

    // Delete a medicine by ID
    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }
}
