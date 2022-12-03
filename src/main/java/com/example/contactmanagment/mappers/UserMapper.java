package com.example.contactmanagment.mappers;

import com.example.contactmanagment.dtos.UserInfoDTO;
import com.example.contactmanagment.dtos.UserLoginDTO;
import com.example.contactmanagment.dtos.UserRegistrationDTO;
import com.example.contactmanagment.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ContactMapper.class})
public interface UserMapper {

    UserInfoDTO userToDto(User user);

    User userRegDtotoUser(UserRegistrationDTO dto);

    User loginDtoToUser(UserLoginDTO dto);

}
