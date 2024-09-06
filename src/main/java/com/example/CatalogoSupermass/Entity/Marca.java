package com.example.CatalogoSupermass.Entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "marca")
@AllArgsConstructor
@NoArgsConstructor
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMarca;
    private String nameMarca;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL , orphanRemoval = true)
    @JsonIgnore
    private List<Producto> producto;
}
