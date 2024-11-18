package domain.entities.Contactable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table (name="personasJuridicas")
public class PersonaJuridica extends Persona{
    @ElementCollection
    @CollectionTable(name="emailsDeContacto", joinColumns = @JoinColumn(name = "personaJuridica_id", referencedColumnName = "id"))
    @Column(name = "email")
    private List<String> emailsDeContacto;

    @ElementCollection
    @CollectionTable(name="telefonosDeContacto", joinColumns = @JoinColumn(name = "personaJuridica_id", referencedColumnName = "id"))
    @Column(name = "telefono")
    private List<String> telefonosDeContacto;

    @Column(name = "razonSocial")
    private String razonSocial;

    @Column(name = "fechaConstitucion", columnDefinition = "DATE")
    private LocalDate fechaConstitucion;

    @Override
    public String emailPreferido() {
        return null;
    }

    @Override
    public String numeroPreferido() {
        return null;
    }

    @Override
    public String nombre() {
        return null;
    }
}
