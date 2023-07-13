package com.board.domain.admin.service;

import com.board.domain.admin.dto.EmailDto;
import com.board.domain.admin.dto.UserDto;
import com.board.domain.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
    private AdminMapper adminMapper;

    @Autowired
    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public List<UserDto> findAllUser() throws Exception{
        return adminMapper.findAllUser();
    }

    @Override
    public String selectUserEmail(String userId) throws Exception{
        return adminMapper.selectUserEmail(userId);
    }

    @Override
    public void insertEmail(EmailDto emailDto)throws Exception{
        adminMapper.insertEmail(emailDto);
    }
}
