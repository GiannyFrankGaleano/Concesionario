package personas.tipos;

public enum tipoDocumento {
    CEDULA("Cedula","C.C"),
    TARJETA_IDENTIDAD("Tarjeta de identidad","T.I"),
    PASAPORTE("Pasaporte","P.S"),
    CEDELULA_EXTRANJERA("Cedula extranjera","C.E");

    public String nombreLargo;
    public String nombreCorto;

    tipoDocumento(String nombreLargo, String nombreCorto) {
        this.nombreLargo = nombreLargo;
        this.nombreCorto = nombreCorto;
    }
}
