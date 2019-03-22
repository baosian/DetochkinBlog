package com.baosian.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class User {
    private Integer id;
    private String first_name;
    private String last_name;
    private String password;
    private String email;
    private Date created_at;
}
