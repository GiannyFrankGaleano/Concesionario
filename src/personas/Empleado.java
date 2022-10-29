package personas;


import personas.tipos.tipoPermiso;

public class Empleado extends Persona{

    private tipoPermiso tipoPermiso;

    public Empleado(String nombre, int edad, String documento, personas.tipos.tipoDocumento tipoDocumento, String telefono, String direccion) {
        super(nombre, edad, documento, tipoDocumento, telefono, direccion);
    }

    public personas.tipos.tipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(personas.tipos.tipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }



}
