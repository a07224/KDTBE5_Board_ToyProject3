package com.board.domain.admin.controller;

import com.board.domain.admin.MailTestComponents;
import com.board.domain.admin.dto.EmailDto;
import com.board.domain.admin.dto.UserDto;
import com.board.domain.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Email;
import java.util.List;

@Controller
public class AdminController {
    private final MailTestComponents mailTestComponents;
    private final AdminService adminService;
    @Autowired
    public AdminController(MailTestComponents mailTestComponents, AdminService adminService) {
        this.mailTestComponents = mailTestComponents;
        this.adminService = adminService;
    }

    @RequestMapping("/admin/userList")
    public ModelAndView userList() throws Exception {
        ModelAndView mv = new ModelAndView("/admin/userList");
        List<UserDto> list = adminService.findAllUser();
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/admin/sendEmail")
    public ModelAndView sendEmail(@RequestParam String user_id) throws Exception {
        ModelAndView mv = new ModelAndView("/admin/email");
        String userEmail = adminService.selectUserEmail(user_id);
        mv.addObject("userEmail", userEmail);
        return mv;
    }


    @ResponseBody
    @RequestMapping("/admin/email")
    public String email(EmailDto emailDto) throws Exception {
        String message="";
        adminService.insertEmail(emailDto);
        mailTestComponents.sendMailTest();
        message = "<script>alert('이메일을 전송했습니다');location.href='/admin/userList';</script>";
        return message;
    }
}
