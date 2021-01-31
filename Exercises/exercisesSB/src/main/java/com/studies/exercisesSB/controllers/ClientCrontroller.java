package com.studies.exercisesSB.controllers;

import com.studies.exercisesSB.model.entities.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/clients")
public class ClientCrontroller {

    @GetMapping(path = "/any")
    public Client getClient() {
        return new Client(28, "Vinicius", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return new Client(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Client getClientById2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Client(id, "João", "987.654.321-00");
    }
}
