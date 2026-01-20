package com.sample2.sample2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //create database table after applying this
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id //primary key
    private int id;
    private String name;
}
