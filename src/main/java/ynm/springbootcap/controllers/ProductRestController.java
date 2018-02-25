package ynm.springbootcap.controllers;

import ynm.springbootcap.domain.Product;
import ynm.springbootcap.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.listAll();
    }
    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return productService.saveOrUpdate(product);
    }
}


