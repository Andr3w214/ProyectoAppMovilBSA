package com.example.demo.repository;

import com.example.demo.entity.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository
        extends CrudRepository<ProductoEntity, Integer> {
}
