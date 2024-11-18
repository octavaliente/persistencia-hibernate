package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="dias_de_entrenamiento")

public class DiaDeEntrenamiento {
    @Id @GeneratedValue
    private Long id;

    @ManyToMany
    @JoinTable (name = "ejercicios_por_dia",
            joinColumns = @JoinColumn(name = "dia_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ejercicio_id", referencedColumnName = "id"))
    private List<Ejercicio> ejercicios;

    @Column(name = "numero")
    private Integer numero;

    @OneToOne
    @JoinColumn (name = "siguiente_dia_id", referencedColumnName = "id")
    private DiaDeEntrenamiento siguienteDia;


}
