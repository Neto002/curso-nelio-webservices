package com.neto.cursoneliowebservices.services;

import com.neto.cursoneliowebservices.entities.Product;
import com.neto.cursoneliowebservices.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public Product findById(Long id) {
        return this.productRepository.findById(id).get();
    }
}
