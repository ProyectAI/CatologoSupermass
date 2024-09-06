package com.example.CatalogoSupermass.Controller;

import com.example.CatalogoSupermass.Entity.Cliente;
import com.example.CatalogoSupermass.Entity.Producto;
import com.example.CatalogoSupermass.Service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin("*")
@AllArgsConstructor
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/client")
    public List<Cliente> getAll(){
        return clientService.clientAll();
    }

    @GetMapping("/client/{id}")
    public Optional<Cliente> getId(@PathVariable("id") Long id){
        return clientService.clienteId(id);
    }

    @PostMapping("/client/save")
    public void saveClient(@RequestBody Cliente cliente){
        clientService.saveUpdateClient(cliente);
    }

    @PutMapping("/client/update")
    public void updateClient(@RequestBody Cliente cliente){
        clientService.saveUpdateClient(cliente);
    }

    @DeleteMapping("/client/{id}")
    public void deleted(@PathVariable("id") Long id){
        clientService.deletedClient(id);
    }

}
