package com.uniquedreamtravel.udt.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping(value = "/prueba", produces = "application/json")
    ResponseEntity<String> prueba() {
        JSONObject response = new JSONObject();
            response.accumulate("response", "Hola mundo");

        return ResponseEntity.ok(response.toString());
    }

}
