package com.hg.controller;

import com.hg.entity.AdminInfo;
import com.hg.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * Created by sstl on 2017/8/11.
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public String getAllAdmin(Model model){
        List<AdminInfo> admins = adminService.getAllAdmin();
        model.addAttribute("admins", admins);
        System.out.println(admins.toString());
        return "index";
    }

    @RequestMapping("/{id}")
    public String getAdminById(@PathVariable(value="id")Integer id, Model model){
        AdminInfo adminInfo = adminService.getAdminById(id);
        System.out.println(adminInfo.toString());
        model.addAttribute("admin", adminInfo);
        return "index2";
    }
}
