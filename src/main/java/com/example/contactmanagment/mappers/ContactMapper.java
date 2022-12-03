package com.example.contactmanagment.mappers;

import com.example.contactmanagment.dtos.ContactDTO;
import com.example.contactmanagment.models.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ContactMapper {

    ContactDTO contactToDto(Contact contact);

    Contact dtoToContact(ContactDTO dto);

}
