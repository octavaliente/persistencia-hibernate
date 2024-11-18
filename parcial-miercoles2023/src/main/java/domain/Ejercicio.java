package domain;

import javax.persistence.*;

@Entity
@Table(name = "ejercicios")
public class Ejercicio {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "detalle")
    private String detalle;
}
