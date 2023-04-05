package com.MmaCodes.ecommerce.controllers;

import com.MmaCodes.ecommerce.documents.Product;
import com.MmaCodes.ecommerce.dto.ProductDTO;
import com.MmaCodes.ecommerce.services.product.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product/v1/")
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    @PostMapping("create")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductDTO productDTO){
        return this.productService.createProduct(productDTO);
    }

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id){
        return productService.getProduct(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable String id){
        return productService.updateProduct(product,id);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id){
        return productService.deleteProduct(id);
    }

    @GetMapping("products")
    public ResponseEntity<List<Product>> getAll(){
        return productService.getAll();
    }

    @PutMapping("sales")
    public ResponseEntity<Product> updateSalePrice(String productId, double salePrice){
        return productService.updateSalePrice(productId,salePrice);
    }

}
