package com.cm.controller;

import com.cm.model.AdminModel;
import com.cm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @RequestMapping("/getAllAdmin")
    @ResponseBody
    public List<AdminModel> getAllAdmin(){
        List<AdminModel> adminModel = adminService.getAllAdmin();
        return adminModel;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public AdminModel getById(int id){
        System.out.print(id);
          AdminModel adminModel= adminService.getById(id);
        return adminModel;
    }

}
