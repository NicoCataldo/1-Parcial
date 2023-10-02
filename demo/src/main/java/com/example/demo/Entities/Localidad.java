package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Localidad")
@Getter
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Localidad extends Base {
    @Column(name = "denominacion")
    private String denominacion;
}
