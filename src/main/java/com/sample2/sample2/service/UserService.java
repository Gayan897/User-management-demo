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
        return modelMapper.map(userList, new TypeToken<UserDTO>(){}.getType());
    }
}
