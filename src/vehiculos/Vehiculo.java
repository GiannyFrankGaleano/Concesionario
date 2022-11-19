package vehiculos;

import vehiculos.tipos.TipoMarca;

public class Vehiculo {
    private TipoMarca Marca;
    private int Modelo;
    private int Precio;
    private String Matricula;
    private String Color;

    public TipoMarca getMarca() {
        return Marca;
    }

    public void setMarca(TipoMarca marca) {
        Marca = marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Vehiculo(TipoMarca marca, int modelo, int precio, String matricula, String color) {
        Marca = marca;
        Modelo = modelo;
        Precio = precio;
        Matricula = matricula;
        Color = color;
    }

}
