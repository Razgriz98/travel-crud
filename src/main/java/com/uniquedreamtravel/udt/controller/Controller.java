package com.uniquedreamtravel.udt.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.uniquedreamtravel.udt.dto.UsersDTO;
import com.uniquedreamtravel.udt.services.UsersService;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class Controller {

    @Autowired
    private UsersService usersService;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/prueba", produces = "application/json")
    ResponseEntity<UsersDTO> prueba(@RequestBody UsersDTO user) {
        return ResponseEntity.ok(usersService.getUser(user.getUsername()));
    }

}
