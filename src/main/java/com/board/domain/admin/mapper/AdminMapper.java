package com.board.domain.admin.mapper;

import com.board.domain.admin.dto.EmailDto;
import com.board.domain.admin.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<UserDto> findAllUser();
    String selectUserEmail(String userId);
    void insertEmail(EmailDto emailDto) throws Exception;
}
