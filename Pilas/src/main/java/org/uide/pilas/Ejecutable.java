/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.uide.pilas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutable {

    public static void main(String[] args) {
        GestorHistorial gestor = new GestorHistorial();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre de la web");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la direccion  web");
            String direccion = entrada.nextLine();
            System.out.println("Desde que dispositivo ingresas");
            String dispositivo = entrada.nextLine();
            gestor.VisitarWeb(new PaginaWeb(nombre, direccion, new Date(), null, null, dispositivo));

        }
        gestor.historial();
        System.out.println("---------------------");
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        gestor.cerrarWeb();
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        gestor.eliminarWeb();
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        
        
        System.out.println("---------------------");
        System.out.println("Ingrese el dispositivo del que quiere obtener el historial");
        String dispositivo = entrada.nextLine();
        System.out.println(gestor.obtenerVisitaDispositivo(dispositivo).toString());
       

    }

}
