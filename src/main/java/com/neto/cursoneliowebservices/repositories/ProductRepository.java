package com.neto.cursoneliowebservices.repositories;

import com.neto.cursoneliowebservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
