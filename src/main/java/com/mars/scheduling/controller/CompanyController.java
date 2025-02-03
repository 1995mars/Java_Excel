//package com.mars.scheduling.controller;
//
//import com.mars.scheduling.entity.Company;
//import com.mars.scheduling.service.CompanyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/company")
//public class CompanyController {
//
//    @Autowired
//    private CompanyService companyService;
//
//    @GetMapping("")
//    public List<Company> getAllSchedules() {
//        return companyService.getAllSchedules();
//    }
//
//    @PostMapping("/add")
//    public Company add(@RequestBody Company company){
//        return companyService.add(company);
//    }
//
//    @PostMapping("/edit")
//    public Company edit(@RequestBody Company company) {
//        return companyService.updateSchedule(company);
//    }
//
//}