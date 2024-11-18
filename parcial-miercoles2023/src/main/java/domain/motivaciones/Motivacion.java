package domain.motivaciones;

import domain.Deportista;
import domain.Rutina;

public abstract class Motivacion {

    public abstract Rutina generarRutinaPara(Deportista unDeportista);
}
