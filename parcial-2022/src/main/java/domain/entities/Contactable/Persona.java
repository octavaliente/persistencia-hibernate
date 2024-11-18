package domain.entities.Contactable;

import domain.convertes.MedioDeComunicacionConverter;
import domain.entities.Direccion;
import domain.entities.mediosDeComunicacion.MedioDeComunicacion;

import javax.persistence.*;

@Entity
@Table(name="personas")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona extends Contactable{

    @Column(name = "cuitCuil")
    private String cuitCuil;
    @Embedded
    private Direccion direccion;
    @Convert(converter = MedioDeComunicacionConverter.class)
    @Column(name = "medioDeComunicacion")
    private MedioDeComunicacion medioDeComunicacion;

    public abstract String nombre();
}
