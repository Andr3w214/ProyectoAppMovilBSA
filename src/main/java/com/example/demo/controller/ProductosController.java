package com.example.demo.controller;

import com.example.demo.entity.ProductoEntity;
import com.example.demo.model.request.ProductoRequest;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductosController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping("/producto/{id}")
    public ProductoEntity productos(@PathVariable Integer id){
        return this.repository.findById(id).get();
    }

    @PostMapping("/save/product")
    public ResponseEntity<String> save(@RequestBody ProductoRequest request){
        ProductoEntity entity = new ProductoEntity();
        entity.setNombre(request.getName());
        entity.setSku(request.getSku());
        entity.setCantidad(request.getCantidad());

        this.repository.save(entity);

        return ResponseEntity.ok( "El registro se realizo de manera correcta");

    }

}