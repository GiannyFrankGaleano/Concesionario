import personas.Empleado;
import personas.tipos.tipoDocumento;
import personas.tipos.tipoPermiso;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Empleado> empleados;

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("--------------Concesionario UDEV--------------");
        System.out.println("-----------------------------");


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

        empleados.add(primerEmpleado);
        empleados.add(segundoEmpleado);
        empleados.add(tercerEmpleado);


    }
}
