/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.pkg2_andrénavas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private long id;
    private String estado;
    private int precio;
    
    private static Producto PRODUCTO_NO_ENCONTRADO = new Producto("", "");

    private static ArrayList<Producto> Inventario = new ArrayList<>(); 
    
    public Producto(String nombre, String autor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.id = GenerarId();
        this.estado = "disponible";
        this.precio = precio;
    }

    private long GenerarId() {
        Random random = new Random();
        long idGenerado = random.nextLong();

        if (idGenerado >= 0) {
            return idGenerado;
        } else {
            return -idGenerado;
        }
    } 
    
    public static void Producto(Producto Producto) {
        Inventario.add(Producto);
        System.out.println("Producto ingresado al inventario.");
    }
        


    public static Producto buscarProducto(String nombre) {
        for (Producto Producto : Inventario) {
            if (Producto.nombre.equals(nombre)) {
                return Producto;
            }
        }
        return PRODUCTO_NO_ENCONTRADO;
    } 
    
    public static ArrayList<Producto> listarProductoDisponibles() {
        ArrayList<Producto> ProductoDisponibles = new ArrayList<>();
        for (Producto Producto : Inventario) {
            if (Producto.estado.equals("disponible")) {
                ProductoDisponibles.add(Producto);
            }
        }
        return ProductoDisponibles;
    } 
    
    public static Producto modificarProducto(String nombre){
        
        
        return PRODUCTO_NO_ENCONTRADO;       
    }
    
    public static Producto venderProducto(){
        
        return PRODUCTO_NO_ENCONTRADO;       
    } 
    
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Producto: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Precio: " + precio);
    } 
    
}
