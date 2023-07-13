package com.board.domain.admin.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class EmailDto {
    private String emailId;
    private String title;
    private String contents;
    private Timestamp createdAt;
}
