package domain.entities.mediosDeComunicacion;

import domain.entities.Contactable.Contactable;

public class Whatsapp implements MedioDeComunicacion {
    @Override
    public void enviarAviso(String contacto, Contactable unContactable) {
        System.out.println("Enviando aviso por Whatsapp a " + contacto);
    }
}
