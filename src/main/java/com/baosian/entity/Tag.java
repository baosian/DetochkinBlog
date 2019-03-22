package com.baosian.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Tag {
    private Integer id;
    private String name;
}
