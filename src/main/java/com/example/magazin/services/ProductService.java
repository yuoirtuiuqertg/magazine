package com.example.magazin.services;

import com.example.magazin.models.Product;
import com.example.magazin.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> listProducts(String title) {
        List<Product> products = productRepository.findAll();
        if(title != null) productRepository.findByTitle(title);
        return products;
    }

    public void saveProduct(Product product) {
        log.info("Saving ne {}",product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
