/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {
   
    public static void main(String[] args){
        ListaContactos lista = new ListaContactos();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar un nuevo contacto");
            System.out.println("2. Eliminar un contacto existente");
            System.out.println("3. Buscar un contacto por nombre");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
           
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el numero de telefono del contacto: ");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el correo electronico: ");
                    String email = scanner.nextLine();
                    Contactos nuevoContacto = new Contactos(nombre, telefono, email);
                    lista.agregarContacto(nuevoContacto);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a eliminar");
                    String nombreEliminar = scanner.nextLine();
                    for(Contactos contacto: lista.obtenerContactos()){
                        if(contacto.getNombre().equals(nombreEliminar)){
                            lista.eliminarContacto(contacto);
                            System.out.println("Contacto eliminado correctamente.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    lista.buscarContacto(nombreBuscar);
                    break;
                case 4:
                    lista.mostrarContactos();
                    break;
                case 5:
                    System.out.println("Adios! ");
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
                    break;
            }
        }
    }
   
}
