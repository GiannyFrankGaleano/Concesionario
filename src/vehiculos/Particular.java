package vehiculos;

import vehiculos.tipos.TipoMarca;

public class Particular  extends Vehiculo{
    public Particular(TipoMarca marca, int modelo, int precio, String matricula, String color) {
        super(marca, modelo, precio, matricula, color);
    }
}
