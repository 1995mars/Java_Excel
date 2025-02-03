//package com.mars.scheduling.controller;
//
//import com.mars.scheduling.entity.Company;
//import com.mars.scheduling.entity.Role;
//import com.mars.scheduling.service.CompanyService;
//import com.mars.scheduling.service.RoleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/role")
//public class RoleController {
//
//    @Autowired
//    private RoleService roleService;
//
//    @GetMapping("")
//    public List<Role> getAllSchedules() {
//        return roleService.getRoles();
//    }
//
//}