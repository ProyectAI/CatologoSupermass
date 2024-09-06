package com.example.CatalogoSupermass.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;

@Data
@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE producto SET deleted=true WHERE id= ?")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProducto;
    private String tipoProducto;
    private Boolean deleted;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<DetalleVenta> detalleVentas;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

}
