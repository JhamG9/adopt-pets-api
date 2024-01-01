package com.example.petsCrud.controllers;

import com.example.petsCrud.models.PetModel;
import com.example.petsCrud.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    private ArrayList<PetModel> getPets(){
        return this.petService.getPets();
    }

    @PostMapping
    private PetModel savePet(@RequestBody PetModel petRequest){
        System.out.println(petRequest.getUserId());
        return this.petService.savePet(petRequest);
    }
}
