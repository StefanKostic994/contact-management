package com.example.contactmanagment.controllers;

import com.example.contactmanagment.dtos.UserInfoDTO;
import com.example.contactmanagment.dtos.UserRegistrationDTO;
import com.example.contactmanagment.services.UserRegistrationServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/signUp")
public class UserRegistrationController {

    private final UserRegistrationServiceImpl userService;

    public UserRegistrationController(UserRegistrationServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserInfoDTO> signUp(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        UserInfoDTO userInfoDTOResponse = userService.signUp(userRegistrationDTO);
        return ResponseEntity.ok(userInfoDTOResponse);
    }

}
