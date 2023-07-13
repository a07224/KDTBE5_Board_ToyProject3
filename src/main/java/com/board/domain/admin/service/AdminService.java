package com.board.domain.admin.service;

import com.board.domain.admin.dto.EmailDto;
import com.board.domain.admin.dto.UserDto;
import java.util.List;


public interface AdminService{
    List<UserDto> findAllUser() throws Exception;
    String selectUserEmail(String userId) throws Exception;

    void insertEmail(EmailDto emailDto) throws Exception;
}
