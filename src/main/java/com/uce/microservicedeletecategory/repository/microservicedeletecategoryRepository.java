package com.uce.microservicedeletecategory.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uce.microservicedeletecategory.model.Category;

public interface microservicedeletecategoryRepository extends JpaRepository<Category, UUID> {
}

