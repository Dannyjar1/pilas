/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.pilas;

import java.util.Date;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class GestorHistorial {
    
    private Stack pila;

    public GestorHistorial() {
        pila = new Stack();
    }
    
    
    

    public void VisitarWeb(PaginaWeb pagina) {
        pila.push(pagina);
        System.out.print("Se agrego la web al historial");

    }

    public void cerrarWeb() {
        PaginaWeb pg = (PaginaWeb)pila.peek();// obtener el primer elemento
        pg.setHoraCierre(new Date());
        pila.set(0, pg);

    }
    public void eliminarWeb(){
        pila.pop();
        System.out.println("Se elimino el ultimo sitio web");
    }

    public PaginaWeb obtenerUltimaWebVisitada() {
        return (PaginaWeb) pila.peek();
    }

    
    public PaginaWeb obtenerVisitaDispositivo(String dispositivo){
     PaginaWeb ultimoElemento = null;
        for (Object o : pila) {
            PaginaWeb pw = (PaginaWeb) o;
            
            if (pw.getDispositivo().equals(dispositivo)) {
                ultimoElemento  = pw;
            }
        }
        return ultimoElemento;
       
    }
   
      public void historial(){
        for(Object object : pila){
            PaginaWeb p =(PaginaWeb)object;
            System.out.println(p.toString());
        }
    }

    public Stack getPila() {
        return pila;
    }

    public void setPila(Stack pila) {
        this.pila = pila;
    }
     
    

}
