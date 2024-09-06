package com.example.CatalogoSupermass.Service;

import com.example.CatalogoSupermass.Entity.Vendedor;
import com.example.CatalogoSupermass.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {

    @Autowired
    VendedorRepository vendedorRepository;

    public List<Vendedor> vendedorAll(){
        return vendedorRepository.findAll();
    }

    public Optional<Vendedor> vendedorId(Long idVendedor){
        return vendedorRepository.findById(idVendedor);
    }

    public void saveUpdateVendedor(Vendedor vendedor){
        vendedorRepository.save(vendedor);
    }

    public void deletedVendedor(Long idVendedor){
        vendedorRepository.deleteById(idVendedor);
    }
}
