package com.APIproject.Productmanagement.Controller;

import com.APIproject.Productmanagement.Service.ProductService;
import com.APIproject.Productmanagement.dto.ProductRequest;
import com.APIproject.Productmanagement.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequset) {
      productService.createProduct(productRequset);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
      return  productService.getAllProducts();
    }
}
