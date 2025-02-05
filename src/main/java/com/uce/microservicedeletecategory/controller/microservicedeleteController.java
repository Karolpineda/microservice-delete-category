package com.uce.microservicedeletecategory.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.microservicedeletecategory.model.Category;
import com.uce.microservicedeletecategory.repository.microservicedeletecategoryRepository;

@RestController
@RequestMapping("/api/categories")
public class microservicedeleteController {

    @Autowired
    private com.uce.microservicedeletecategory.repository.microservicedeletecategoryRepository microservicedeletecategoryRepository;

    // Endpoint Health para verificar si el microservicio está activo
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Microservicio DELETE Category está en funcionamiento");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable UUID id) {
        Optional<Category> existingCategory = microservicedeletecategoryRepository.findById(id);

        // Verificar si la categoría existe
        if (existingCategory.isPresent()) {
            // Eliminar la categoría si existe
            microservicedeletecategoryRepository.delete(existingCategory.get());

            // Devolver un mensaje con código 200 (OK) si la eliminación fue exitosa
            return ResponseEntity.ok("Categoría eliminada exitosamente.");
        }

        // Si la categoría no existe, devolver 404 (Not Found)
        return ResponseEntity.notFound().build();
    }


}
