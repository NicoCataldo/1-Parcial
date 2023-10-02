package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Persona")
public class Persona extends Base{

    @Column(name="Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name ="Dni")
    private String dni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name ="libro_id")

    )
    private List<Libro> libros = new ArrayList<Libro>();

}
