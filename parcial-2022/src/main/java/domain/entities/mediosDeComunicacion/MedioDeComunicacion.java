package domain.entities.mediosDeComunicacion;

import domain.entities.Contactable.Contactable;

public interface MedioDeComunicacion {
    public void enviarAviso(String contacto, Contactable unContactable);
}
