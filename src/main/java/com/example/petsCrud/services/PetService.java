package com.example.petsCrud.services;

import com.example.petsCrud.models.PetModel;
import com.example.petsCrud.models.UserModel;
import com.example.petsCrud.repositories.PetRepository;
import com.example.petsCrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;
    @Autowired
    private UserRepository userRepository;

    public PetModel savePet(PetModel pet){
        UserModel user = this.userRepository.findById(pet.getUserId()).get();
        PetModel petToSave = new PetModel();
        petToSave.setName(pet.getName());
        petToSave.setType(pet.getType());
        petToSave.setUser(user);

        return this.petRepository.save(petToSave);
    }

    public ArrayList<PetModel> getPets(){
        return (ArrayList<PetModel>) this.petRepository.findAll();
    }
}
