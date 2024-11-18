package domain.entities.Contactable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table (name="personasFisicas")
public class PersonaFisica extends Persona{
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;

    @Override
    public String emailPreferido(){
        return this.email;
    }

    @Override
    public String nombre(){
        return this.nombre;
    }

    @Override
    public String numeroPreferido(){
        return this.telefono;
    }
}
