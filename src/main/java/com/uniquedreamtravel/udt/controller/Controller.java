package com.uniquedreamtravel.udt.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class Controller {

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/prueba", produces = "application/json")
    ResponseEntity<String> prueba() {
        JSONObject response = new JSONObject();
            response.accumulate("response", "Hola mundo");
        log.info("Llamada");
        return ResponseEntity.ok(response.toString());
    }

}
