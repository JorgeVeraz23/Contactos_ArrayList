/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author USER
 */
public class ListaContactos {
   private ArrayList<Contactos> contactos;
   
   public ListaContactos(){
       contactos = new ArrayList<Contactos>();
   }
    
    //metodos para agregar, eliminar, buscar y mostrar contactos
    
    public void agregarContacto(Contactos contacto){
        contactos.add(contacto);
    }
    
    public void eliminarContacto(Contactos contacto){
        contactos.remove(contacto);
    }
    
    public void buscarContacto(String nombre){
        Iterator<Contactos> it = contactos.iterator();
        while(it.hasNext()){
            Contactos contacto = it.next();
            if(contacto.getNombre().equals(nombre)){
                System.out.println(contacto);
            }
        }
    }
    
    public void mostrarContactos(){
        for(Contactos c : contactos){
            System.out.println(c);
        }
    }
    
    public ArrayList<Contactos> obtenerContactos(){
        return contactos;
    }
    
    
    

    
    
}
