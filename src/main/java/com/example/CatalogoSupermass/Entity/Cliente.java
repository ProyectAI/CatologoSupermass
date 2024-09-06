package com.example.CatalogoSupermass.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;

@Data
@Entity
@Table(name = "cliente")
@Where(clause = "deleted= false")
@SQLDelete(sql = "UPDATE cliente SET deleted=true WHERE id=? ")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCliente;
    private int dniCliente;
    private String direccionCliente;
    private Boolean deleted;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Venta> venta;

}
