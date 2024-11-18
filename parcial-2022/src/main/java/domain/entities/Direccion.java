package domain.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Direccion {

    @Column(name = "altura")
    private int altura;

    @Column(name="calle")
    private String calle;

    @Column(name = "codigo_postal")
    private String localidadBarrio;

    @Column(name = "municipio_comuna", nullable = false)
    private String municipioComuna;

    @Column(name = "provincia", nullable = false)
    private String provincia;

    public String leyendaCompleta(){
        return "";
    }
}
