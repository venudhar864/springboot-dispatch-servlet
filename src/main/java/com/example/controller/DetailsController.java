package com.example.controller;

import com.example.model.Details;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/details")
public class DetailsController {
    private final List<Details> detailsList = new ArrayList<>();

    @GetMapping
    public List<Details> getDetails() {
        return detailsList;
    }

    @PostMapping
    public String addDetails(@RequestBody Details details) {
        detailsList.add(details);
        return "Data Inserted Successfully";
    }

    @PutMapping("/{id}")
    public String updateDetails(@PathVariable int id, @RequestBody Details updatedDetails) {
        for (Details details : detailsList) {
            if (details.getId() == id) {
                details.setName(updatedDetails.getName());
                return "Data Updated Successfully";
            }
        }
        return "Detail not found!";
    }

    @DeleteMapping("/{id}")
    public String deleteDetails(@PathVariable int id) {
        detailsList.removeIf(details -> details.getId() == id);
        return "Data Deleted Successfully";
    }
}
