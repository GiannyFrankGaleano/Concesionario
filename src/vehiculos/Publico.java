package vehiculos;

import vehiculos.tipos.TipoMarca;
import vehiculos.tipos.TipoPublico;

public class Publico extends Vehiculo {
    private int NumeroPlanilla;
    private TipoPublico tipoPublico;

    public Publico(TipoMarca marca, int modelo, int precio, String matricula, String color) {
        super(marca, modelo, precio, matricula, color);
    }

    public int getNumeroPlanilla() {
        return NumeroPlanilla;
    }

    public void setNumeroPlanilla(int numeroPlanilla) {
        NumeroPlanilla = numeroPlanilla;
    }

    public TipoPublico getTipoPublico() {
        return tipoPublico;
    }

    public void setTipoPublico(TipoPublico tipoPublico) {
        this.tipoPublico = tipoPublico;
    }
}
