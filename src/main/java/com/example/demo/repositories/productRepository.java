package com.example.demo.repositories;

import com.example.demo.entities.productEntities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends CrudRepository<productEntities, String> {
    public List<productEntities> findAllByProductId(String productid);
}
