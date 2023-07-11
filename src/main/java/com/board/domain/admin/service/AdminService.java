package com.board.domain.admin.service;

import com.board.domain.admin.dto.UserDto;

import java.util.List;


public interface AdminService{
    List<UserDto> findAllUser() throws Exception;
}
