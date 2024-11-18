package domain.entities.mediosDeComunicacion;

import domain.entities.Contactable.Contactable;

public class Email implements MedioDeComunicacion {
    @Override
    public void enviarAviso(String contacto, Contactable unContactable) {
        System.out.println("Enviando aviso por Email a " + contacto);
    }
}
