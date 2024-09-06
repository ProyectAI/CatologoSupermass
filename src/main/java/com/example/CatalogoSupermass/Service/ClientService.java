package com.example.CatalogoSupermass.Service;

import com.example.CatalogoSupermass.Entity.Cliente;
import com.example.CatalogoSupermass.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Cliente> clientAll(){
        return clientRepository.findAll();
    }

    public Optional<Cliente> clienteId(Long id){
        return clientRepository.findById(id);
    }

    public void saveUpdateClient(Cliente cliente){
        clientRepository.save(cliente);
    }

    public void deletedClient(Long id){
        clientRepository.deleteById(id);
    }

}
