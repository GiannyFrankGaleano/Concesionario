package personas;

import personas.tipos.tipoCliente;
import personas.tipos.tipoDocumento;

public class Cliente extends Persona {
    private tipoCliente tipoCliente;

    public Cliente(String nombre, int edad, String documento, tipoDocumento tipoDocumento, String telefono, String direccion) {
        super(nombre, edad, documento, tipoDocumento, telefono, direccion);
    }

    public personas.tipos.tipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(personas.tipos.tipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
