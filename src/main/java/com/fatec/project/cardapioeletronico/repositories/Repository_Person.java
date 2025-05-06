package com.fatec.project.cardapioeletronico.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.project.cardapioeletronico.models.ModelPerson;

public interface Repository_Person extends JpaRepository<ModelPerson, String>{
    Optional<ModelPerson> findByEmail(String login);

}
