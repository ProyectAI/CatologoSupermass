package com.example.CatalogoSupermass.Controller;


import com.example.CatalogoSupermass.Entity.Vendedor;
import com.example.CatalogoSupermass.Service.VendedorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin("*")
@AllArgsConstructor
public class VendedorController {

    @Autowired
    VendedorService vendedorService;

    @GetMapping("/vendedor")
    public List<Vendedor> getAll(){
        return vendedorService.vendedorAll();
    }

    @GetMapping("/vendedor/{idVendedor}")
    public Optional<Vendedor> getId(@PathVariable("idVendedor") Long idVendedor){
         return vendedorService.vendedorId(idVendedor);
    }

    @PostMapping("/vendedor/save")
    public void vendedorSave(@RequestBody Vendedor vendedor){
        vendedorService.saveUpdateVendedor(vendedor);
    }

    @PutMapping("/vendedor/update")
    public void vendedorUpdate(@RequestBody Vendedor vendedor){
        vendedorService.saveUpdateVendedor(vendedor);
    }

    @DeleteMapping("/vendedor/{idVendedor}")
    public void vendedorDeleted(@PathVariable("idVendedor")Long idVendedor){
        vendedorService.deletedVendedor(idVendedor);
    }
}
