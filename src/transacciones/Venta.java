package transacciones;

import personas.Cliente;
import personas.Empleado;
import vehiculos.Particular;
import vehiculos.Publico;

import java.util.ArrayList;

public class Venta {
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;


    private ArrayList<Particular> carrosParticulares;
    private  ArrayList<Publico> carrosPublicos;
}
