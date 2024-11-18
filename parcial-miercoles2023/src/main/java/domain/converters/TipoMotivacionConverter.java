package domain.converters;

import domain.motivaciones.BajarDePeso;
import domain.motivaciones.Mantener;
import domain.motivaciones.Motivacion;
import domain.motivaciones.Tonificar;

import javax.persistence.AttributeConverter;

public class TipoMotivacionConverter implements AttributeConverter<Motivacion, String> {
    @Override
    public String convertToDatabaseColumn(Motivacion motivacion) {
        if(motivacion instanceof Mantener){
            return "Mantener";
        }
        else if (motivacion instanceof Tonificar){
            return "Tonificar";
        }
        else if (motivacion instanceof BajarDePeso){
            return "BajarDePeso";
        }
        else{
            return null;
        }
    }

    @Override
    public Motivacion convertToEntityAttribute(String dbData) {
        if("Mantener".equals(dbData)){
            return new Mantener();
        }
        else if ("Tonificar".equals(dbData)){
            return new Tonificar();
        }
        else if ("BajarDePeso".equals(dbData)){
            return new BajarDePeso();
        }
        else{
            return null;
        }
    }
}
