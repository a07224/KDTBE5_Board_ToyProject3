package com.board.domain.admin.controller;

import com.board.domain.admin.dto.UserDto;
import com.board.domain.admin.service.AdminService;
import com.board.domain.admin.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("/admin/userList")
    public ModelAndView userList() throws Exception {
        ModelAndView mv = new ModelAndView("/admin/userList");
        List<UserDto> list = adminService.findAllUser();
        mv.addObject("list", list);
        return mv;
    }
}
