package vehiculos;

import vehiculos.tipos.TipoMarca;

public class Vehiculo {
    private TipoMarca Marca;
    private int Modelo;
    private int Precio;
    private String Matricula;
    private String Color;

    public Vehiculo(TipoMarca marca, int modelo, int precio, String matricula, String color) {
        Marca = marca;
        Modelo = modelo;
        Precio = precio;
        Matricula = matricula;
        Color = color;
    }

}
