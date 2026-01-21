package com.sample2.sample2.Controller;


import com.sample2.sample2.dto.UserDTO;
import com.sample2.sample2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    public String saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateuser")
    public String updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteuser")
    public String deleteUser(@RequestBody UserDTO userDTO) {
        return userService.deleteUser(userDTO);

    }
}
