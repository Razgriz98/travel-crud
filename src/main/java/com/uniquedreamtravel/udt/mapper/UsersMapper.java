package com.uniquedreamtravel.udt.mapper;

import com.uniquedreamtravel.udt.db.entities.UsersEntity;
import com.uniquedreamtravel.udt.dto.UsersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsersMapper {

    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "createdAt", source = "createdAt")
    UsersDTO usersEntitytoUsersDTO(UsersEntity usersEntity);
}
