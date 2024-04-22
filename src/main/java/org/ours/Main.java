package org.ours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                --------------------------------------------------
                Se arrancan los vehículos a través de clase absxxx
                --------------------------------------------------
                """);

        Vehiculo[] v = {new Carro(), new Avion(), new Moto()};
        List<Vehiculo> vehiculos = new ArrayList<>(Arrays.asList(v));

        Groovy groovy = new Groovy();
        Interfaz interfaz = new Interfaz();
        GeneralParticular gp = new GeneralParticular();

        groovy.imprimir(vehiculos);
        interfaz.imprimir(vehiculos);
        gp.imprimir(vehiculos);


    }
}
