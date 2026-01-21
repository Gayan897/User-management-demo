package com.sample2.sample2.service;

import com.sample2.sample2.dto.UserDTO;
import com.sample2.sample2.model.User;
import com.sample2.sample2.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional //for data transaction
public class UserService {
    @Autowired //uses for inject dependencies
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User>userList = userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public String saveUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, User.class));
        return "User save succcessfully";
    }

    public String updateUser(UserDTO userDTO){ // we can either use UserDTO as a data type
        userRepository.save(modelMapper.map(userDTO, User.class));
        return "User update successfully"; // instead of this message we can pass the whatever values we entered ex: return UserDTO;
    }

    public String deleteUser(UserDTO userDTO) {
        userRepository.delete(modelMapper.map(userDTO, User.class));
        return "User Deleted";
    }
}
