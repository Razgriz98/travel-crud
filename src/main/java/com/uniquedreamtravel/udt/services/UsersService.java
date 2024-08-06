package com.uniquedreamtravel.udt.services;

import com.uniquedreamtravel.udt.db.dao.UsersDAO;
import com.uniquedreamtravel.udt.dto.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersDAO usersDAO;

    public UsersDTO getUser(String name) {
        return usersDAO.getUser(name);
    }
}
