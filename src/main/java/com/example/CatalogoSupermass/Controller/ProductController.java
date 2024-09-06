package com.example.CatalogoSupermass.Controller;


import com.example.CatalogoSupermass.Entity.Producto;
import com.example.CatalogoSupermass.Service.ProductService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin("*")
@AllArgsConstructor
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public List<Producto> getAll(){
        return productService.productAll();
    }

    @GetMapping("/product/{id}")
    public Optional<Producto> getId(@PathVariable("id") Long id){
        return productService.productId(id);
    }

    @PostMapping("/product/save")
    public void saveProduct(@RequestBody Producto producto){
        productService.saveUpdateProduct(producto);
    }

    @PutMapping("/product/update")
    public void updateProduct(@RequestBody Producto producto){
        productService.saveUpdateProduct(producto);
    }

    @DeleteMapping("/product/{id}")
    public void deleted(@PathVariable("id") Long id){
        productService.deletedProduct(id);
    }


}
