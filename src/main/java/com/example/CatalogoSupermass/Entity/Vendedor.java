package com.example.CatalogoSupermass.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedor;
    private String nameVendedor;
    private int edadVendedor;
    private String direccionVendedor;
    private int celularVendedor;
    private String emailVendedor;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Venta> venta;


}
