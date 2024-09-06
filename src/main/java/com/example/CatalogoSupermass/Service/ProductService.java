package com.example.CatalogoSupermass.Service;

import com.example.CatalogoSupermass.Entity.Producto;
import com.example.CatalogoSupermass.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService  {

    @Autowired
    ProductRepository productRepository;

    public List<Producto> productAll(){
        return productRepository.findAll();
    }

    public Optional<Producto> productId(long id){
        return productRepository.findById(id);
    }

    public void saveUpdateProduct(Producto producto){
        productRepository.save(producto);
    }

    public void deletedProduct(long id){
        productRepository.deleteById(id);
    }


}
