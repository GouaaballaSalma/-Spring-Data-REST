package com.example.demo.repository;

import com.example.demo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

    // Exposer un endpoint pour chercher des clients par nom
    @RestResource(path = "/byName")
    public List<Client> findByNomContains(@Param("n") String nom);
}