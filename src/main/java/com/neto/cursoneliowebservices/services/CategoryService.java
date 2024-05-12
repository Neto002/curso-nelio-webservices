package com.neto.cursoneliowebservices.services;

import com.neto.cursoneliowebservices.entities.Category;
import com.neto.cursoneliowebservices.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    public Category findById(Long id) {
        return this.categoryRepository.findById(id).get();
    }
}
