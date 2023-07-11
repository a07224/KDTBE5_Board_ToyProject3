package com.board.domain.admin.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserDto {
    private String userId;
    private String userName;
    private String email;
    private String nickname;
    private String role;
    private Timestamp createdAt;
    private Timestamp updateAt;
}
