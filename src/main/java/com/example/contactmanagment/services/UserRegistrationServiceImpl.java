package com.example.contactmanagment.services;

import com.example.contactmanagment.dtos.UserInfoDTO;
import com.example.contactmanagment.dtos.UserRegistrationDTO;
import com.example.contactmanagment.mappers.UserMapper;
import com.example.contactmanagment.models.Role;
import com.example.contactmanagment.models.User;
import com.example.contactmanagment.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserMapper userMapper;

    public UserRegistrationServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException(String.format("User with id %s not found",username)));
    }

    public UserInfoDTO signUp(UserRegistrationDTO registrationDTO) {
        boolean isUserExists = userRepository.findByUsername(registrationDTO.getUsername()).isPresent();
        if(isUserExists) {
            throw new IllegalStateException(String.format("User with username %s already exist", registrationDTO.getUsername()));
        }

        String encodedPassword = bCryptPasswordEncoder.encode(registrationDTO.getPassword());
        User user = userMapper.userRegDtotoUser(registrationDTO);
        user.setPassword(encodedPassword);
        user.setRole(Role.valueOf("USER"));

        User savedUser = userRepository.save(user);
        return userMapper.userToDto(savedUser);
    }
}
