package com.example.demo.controllers;

import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.productRepository;
import com.mongodb.util.JSON;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    private ClientRepository repo;
    private productRepository prepo;

    public ClientController(ClientRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/json")
    public  String clients(Model model){

        JSONObject dbs = new JSONObject();
        dbs.put("clients",repo.findAll());
        dbs.put("products", prepo.findAll());
        model.addAttribute("clients", dbs);
        return "clients";
    }//nono
}
