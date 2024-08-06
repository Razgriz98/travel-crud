package com.uniquedreamtravel.udt.db.dao;

import com.uniquedreamtravel.udt.db.entities.UsersEntity;
import com.uniquedreamtravel.udt.db.repositories.UsersRepository;
import com.uniquedreamtravel.udt.dto.UsersDTO;
import com.uniquedreamtravel.udt.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersDAO {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersMapper usersMapper;

    public UsersDTO getUser(String name) {
        UsersEntity usersEntity = usersRepository.findByUsername(name);
        return usersMapper.usersEntitytoUsersDTO(usersEntity);
    }


}
