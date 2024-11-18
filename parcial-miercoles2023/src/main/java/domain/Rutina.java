package domain;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.List;

@Entity
@Table(name = "rutinas")
public class Rutina {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "rutinaAnterior_id", referencedColumnName = "id")
    private Rutina rutinaAnterior;

    @OneToMany
    @JoinColumn(name = "rutina_id", referencedColumnName = "id")
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;
}
