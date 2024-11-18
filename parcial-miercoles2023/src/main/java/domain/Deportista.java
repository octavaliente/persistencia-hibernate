package domain;

import domain.converters.TipoMotivacionConverter;
import domain.motivaciones.Motivacion;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="deportistas")

public class Deportista {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "apellido")
    private String apellido;

    @Convert(converter = TipoMotivacionConverter.class)
    @Column(name = "motivacion_principal")
    private Motivacion motivacionPrincipal;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "peso_inicial")
    private Double pesoInicial;

    @ElementCollection
    @CollectionTable(name = "contactos_telefonicos", joinColumns = @JoinColumn(name = "deportista_id", referencedColumnName = "id"))
    @Column(name="telefono")
    private List<String> contactosTelefonicos;

    @OneToOne
    @JoinColumn (name ="rutina_id", referencedColumnName = "id")
    private Rutina rutina;
}
