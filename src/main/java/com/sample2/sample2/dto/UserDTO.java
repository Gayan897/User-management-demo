package com.sample2.sample2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//handling the data support
@NoArgsConstructor// create plain constructor without arguments
@AllArgsConstructor// automatically generates a constructor with parameters for all class fields
public class UserDTO {
    private int id;
    private String name;
}
