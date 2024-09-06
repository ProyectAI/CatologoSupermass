package com.example.CatalogoSupermass.Repository;

import com.example.CatalogoSupermass.Entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {


}
