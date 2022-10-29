package personas ;


import personas.tipos.tipoDocumento;

public class Persona  {
    private String nombre;
    private int edad;
    private String documento;
    private tipoDocumento tipoDocumento;
    private String telefono;
    private String Direccion;

    public Persona(String nombre, int edad, String documento, personas.tipos.tipoDocumento tipoDocumento, String telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.telefono = telefono;
        Direccion = direccion;
    }
}
