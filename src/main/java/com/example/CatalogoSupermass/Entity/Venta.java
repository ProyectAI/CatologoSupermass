package com.example.CatalogoSupermass.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "venta")
@AllArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVenta;
    private Date fechaEmision;
    private double total;


    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<DetalleVenta> detalleVentas;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;



}
