package org.ours;

import java.util.List;


public class GeneralParticular {
    public void imprimir(List<Vehiculo> vehiculos) {
        System.out.println("""
                --------------------------------------------------
                finalización de arranque con clase abs
                --------------------------------------------------
                DESCRIPCIÓN:
                Los vehículos: Carro, Moto, AVión. Se inicializan a
                través del método en la interfaz pero adicional, en
                tiempo de ejecución se determina el tipo de clase y
                se nombra la clase.
                
                Como sigue:
                
                
                """);

        Class clase;

        for (Vehiculo v: vehiculos){
            clase = v.getClass();
            v.arrancar();
            System.out.println("Se ha arrancado una clase tipo: " + clase.getName());
        }

        System.out.println("""
                
                --------------------------------------------------
                Finalización de arranque con clase abs
                --------------------------------------------------
                """);
    }
}
