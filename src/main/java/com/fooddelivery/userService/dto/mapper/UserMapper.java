package com.fooddelivery.userService.dto.mapper;

import com.fooddelivery.userService.dto.UserDTO;
import com.fooddelivery.userService.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);
}
