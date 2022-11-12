import personas.Empleado;
import personas.tipos.tipoDocumento;
import personas.tipos.tipoPermiso;
import vehiculos.Particular;
import vehiculos.Vehiculo;
import vehiculos.tipos.TipoMarca;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {


        generarEmpleados();
    }

    private static void generarEmpleados() {
        Empleado primerEmpleado = new Empleado("Juan Esteban", 28, "1163079353",
                tipoDocumento.CEDULA, "31723432423", "Calle 3 # 7-123");

        primerEmpleado.setTipoPermiso(tipoPermiso.VENTA);

        Empleado segundoEmpleado = new Empleado("Angelica", 20, "1883248338",
                tipoDocumento.CEDELULA_EXTRANJERA, "3163249000", "Carrera 123 #18-60");

        segundoEmpleado.setTipoPermiso(tipoPermiso.COMPRA);

        Empleado tercerEmpleado = new Empleado("Santiago", 47, "21456890",
                tipoDocumento.PASAPORTE, "3234569091", "Avenida 23 #19A-89");

        tercerEmpleado.setTipoPermiso(tipoPermiso.TODOS);

        Empleado cuartoEmpleado = new Empleado("Mateo", 32, "111236654", tipoDocumento.CEDULA, "31231323232", "Carrera 123A #18-23");

        cuartoEmpleado.setTipoPermiso(tipoPermiso.COMPRA);

        empleados.add(primerEmpleado);
        empleados.add(segundoEmpleado);
        empleados.add(tercerEmpleado);
        empleados.add(cuartoEmpleado);


    }

    public static void menuPrincipal() {
        System.out.println("------------------------------------------------");
        System.out.println("--------------Concesionario UDEV--------------");
        System.out.println("------------------------------------------------");
        String mensaje = "Elija una opcion \n"
                + "1. Venta de vehiculo \n"
                + "2. Ingreso de Vehiculo\n"
                + "3. Salir";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        switch (opcion) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

            default:
        }
    }

    private static void ventaVehiculo() {

        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error; no hay vehiculos en la lista", "VEHICULOS NO DISPONIBLES", JOptionPane.ERROR_MESSAGE);



        } else {

        }

    }

    private static void IngresarVehiculo() {
        TipoMarca marca;
        int modelo;
        int precio;
        String matricula;
        String color;

        if (preguntaVehiculo()){
            Particular particular = new Particular(TipoMarca.BENTLEY, 2021, 400000000, "OMG007", "Negro");
        }
    }

    private static boolean preguntaVehiculo() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de vehiculo desea?\n"
                + "1. particular\n" + "2. Publico"));
        return tipo == 1;
    }

    private static TipoMarca elegirMarcaVehiculo() {
        TipoMarca NewMarca = null;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la marca que desea comprar: \n"
                + "1. CHEVROLET\n"
                + "2. FORD\n"
                + "3. PORCHE\n"
                + "4. BENTLEY\n"
                + "5. TOYOTA"));

        switch (opcion) {
            case 1:
                NewMarca = TipoMarca.CHEVROLET;
                break;
            case 2:
                NewMarca = TipoMarca.FORD;
                break;
            case 3:
                NewMarca = TipoMarca.PORCHE;
                break;
            case 4:
                NewMarca = TipoMarca.BENTLEY;
                break;

            case 5:
                NewMarca = TipoMarca.TOYOTA;
                break;

            default:
            JOptionPane.showMessageDialog(null,"Opcion no valida","ERROR",JOptionPane.ERROR_MESSAGE);

            elegirMarcaVehiculo();
        }
        return NewMarca;
    }
}
