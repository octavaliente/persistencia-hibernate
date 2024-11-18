package domain.convertes;

import domain.entities.mediosDeComunicacion.MedioDeComunicacion;

import javax.persistence.AttributeConverter;

public class MedioDeComunicacionConverter implements AttributeConverter<MedioDeComunicacion, String> {
    @Override
    public String convertToDatabaseColumn(MedioDeComunicacion medioDeComunicacion) {
        return null;
    }

    @Override
    public MedioDeComunicacion convertToEntityAttribute(String s) {
        return null;
    }
}
