package com.database_connection_method_testing.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class user {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private int status;
    private LocalDateTime created_at;
}
