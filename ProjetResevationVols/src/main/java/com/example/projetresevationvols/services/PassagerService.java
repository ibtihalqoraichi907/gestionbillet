package com.example.projetresevationvols.services;

import com.example.projetresevationvols.entities.Passager;
import com.example.projetresevationvols.repositories.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassagerService {

    private final PassagerRepository passagerRepository;

    @Autowired
    public PassagerService(PassagerRepository passagerRepository) {
        this.passagerRepository = passagerRepository;
    }

    public Passager getPassagerById(Long id) {
        return passagerRepository.findById(id).orElse(null);
    }

    public List<Passager> getAllPassagers() {
        return passagerRepository.findAll();
    }

    public Passager savePassager(Passager passager) {
        return passagerRepository.save(passager);
    }

    public Passager updatePassager(Long id, Passager updatedPassager) {
        Passager existingPassager = passagerRepository.findById(id).orElse(null);
        if (existingPassager != null) {

            existingPassager.setNomPrenom(updatedPassager.getNomPrenom());
            existingPassager.setCin(updatedPassager.getCin());
            existingPassager.setEmail(updatedPassager.getEmail());
            existingPassager.setNumpasseport(updatedPassager.getNumpasseport());
            return passagerRepository.save(existingPassager);
        }
        return null;
    }

    public void deletePassager(Long id) {
        passagerRepository.deleteById(id);
    }
}
