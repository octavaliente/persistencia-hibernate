package domain.entities.mediosDeComunicacion;

import domain.entities.Contactable.Contactable;

public class Telegram implements MedioDeComunicacion {
    @Override
    public void enviarAviso(String contacto, Contactable unContactable) {
        System.out.println("Enviando aviso por Telegram a " + contacto);
    }
}
