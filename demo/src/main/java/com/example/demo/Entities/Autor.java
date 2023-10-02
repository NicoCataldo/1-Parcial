package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Autor")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Autor extends Base{
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Biografia", length = 1500)
    private String biografia;

}
