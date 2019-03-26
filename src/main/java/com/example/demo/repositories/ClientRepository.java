package com.example.demo.repositories;

import com.example.demo.entities.clientEntitie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<clientEntitie, String>{
    public List<clientEntitie> findAllByJoined(String joined);
}
