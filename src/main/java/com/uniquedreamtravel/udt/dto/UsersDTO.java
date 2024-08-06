package com.uniquedreamtravel.udt.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsersDTO {

    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;
}
